package remember;

import javax.xml.bind.*;
import java.awt.print.Book;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

public class TryJAXB {
    public static void main(String[] args) throws JAXBException {
        Person person = new Person(false, 29,
                new Contact("8-9503868426"), new String[] {"Worker, Mother"});
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        String result = "";
        try (StringWriter writer = new StringWriter()) {
            marshaller.marshal(person, writer);
            result = writer.getBuffer().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result);
        Person recoveredPerson;
        Unmarshaller unmarshaller = context.createUnmarshaller();
        try (StringReader reader = new StringReader(result)) {
            recoveredPerson = (Person) unmarshaller.unmarshal(reader);
        }
        System.out.println(recoveredPerson.isSex() + " " + recoveredPerson.getAge() + " "
        + recoveredPerson.getContact() + " " + Arrays.toString(recoveredPerson.getStatuses()));
    }


}
