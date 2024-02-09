package remember;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TryJson {
    public static void main(String[] args) {
        JSONObject jsonContact = new JSONObject("{\"phone\":\"89514867109\"}");
        List<String> list = new ArrayList<>();
        list.add("Student");
        list.add("Free");
        JSONArray statuses = new JSONArray(list);
        Person person = new Person(true, 25,
                new Contact("89514867109"), new String[]{"Worker", "Married"});
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("sex", person.isSex());
        jsonObject.put("age", person.getAge());
        jsonObject.put("contact", jsonContact);
        jsonObject.put("statuses", statuses);
        System.out.println(jsonObject.toString());
    }
}
