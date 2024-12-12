
import java.util.*;


class LL
{
    public static void main(String arg[])
    {
        LinkedList<String> animals = new LinkedList<String>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");

        System.out.println("List of Animals :"+animals);

        animals.add(1,"Horse");
        System.out.println("List of Animals :"+animals);

        String str = animals.get(2);
        System.out.println("Animal of index 2 is :"+str);

        animals.set(3,"Bull");
        System.out.println("Updated List of animal is :"+animals);

        animals.addFirst("Elephant");
        animals.addLast("Zebra");
        System.out.println("Updated List of animal is :"+animals);

        animals.removeLast();
        System.out.println("Updated List of animal is :"+animals);


        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        String[] array = animals.toArray(new String[0]);
        System.out.println("Array: ");

        for (String s : array) {
            System.out.println(s);
        }

        animals.clear();
        System.out.println("List after clearing :" +animals);


    }
}
