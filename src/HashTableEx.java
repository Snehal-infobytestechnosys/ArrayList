import java.util.Enumeration;
import java.util.Hashtable;

class HashTableEx{

    public static void main(String arg[]){

        Hashtable<String, Integer> marks = new Hashtable<String, Integer>();
        marks.put("Snehal", 100);
        marks.put("Puja", 200);
        marks.put("Shital", 300);
        marks.put("Rahul", 400);

        Integer value = marks.get("Puja");
        System.out.println("Key Puja :" + value);

        if(marks.containsKey("Snehal")) {
            System.out.println(marks.get("Snehal"));
        }

        Enumeration<String> keys = marks.keys();
        while (keys.hasMoreElements()) {
            System.out.println(marks.get("Key: " +keys.nextElement()));
        }

        System.out.println("Size of Hashtable :" +marks.size());

        marks.remove("Rahul");
        System.out.println(marks);

        marks.clear();
        System.out.println(marks);

    }
}
