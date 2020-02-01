import java.util.HashMap;

public class HM {
    public static void main(String[] args) {
        HashMap<String, String> pets = new HashMap<String, String>();   // creating HashMap, labeled "pets"
        pets.put("Dog", "Chika");                                       // adding items into the "pets"
        pets.put("Cat", "Berenet");
        pets.put("Gold Fish", "Duke Fishron");
        System.out.print(pets);                                         // showing the whole HashMap
    }
}

// This HashMap helps to store items like matrix using dictionary "key/value"
// it can store nulls and keys and nulls values
// you can use .get("key") .remove("key") .clear()
// it is unsynchronized, it is highly important not to share the HashMap between multiple threads,