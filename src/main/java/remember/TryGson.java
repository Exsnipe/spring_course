package remember;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TryGson {
    public static void main(String[] args) {
        Contact contact = new Contact("+7-951-565-78-24");
        Person person = new Person(false, 34, contact, new String[] {"status1", "status2"});

        final Gson gson = new GsonBuilder().create();
        String result = gson.toJson(person);
        System.out.println(result);
        Person reStoredPerson = gson.fromJson(result, Person.class);
        System.out.println(reStoredPerson.isSex() + " " + reStoredPerson.getContact());

    }
}
