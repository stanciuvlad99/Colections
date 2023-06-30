import java.util.*;

public class MainHasMap {
    public static void main(String[] args) {
        HashMap<String, Integer> nameAge = new HashMap<>();

        nameAge.put("Andrei", 20);
        nameAge.put("Marius", 23);
        nameAge.put("Ionut", 30);

        Integer age = nameAge.get("Marius");
        System.out.println(age);

        if (nameAge.containsKey("Ionut")){
            System.out.println("Are 30 de ani");
        }

        System.out.println(nameAge.keySet());
        System.out.println(nameAge.values());
        System.out.println(nameAge.entrySet());
    }
}
