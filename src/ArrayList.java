
import java. util.*;

class AL
{
    public static void main(String args[])
    {
        ArrayList<String> Aobj = new ArrayList<String>();

        Aobj.add("Cat");

        Aobj.add("Dog");
        Aobj.add("Cow");

        System.out.println("Element of ArrayList are : "+Aobj);

        Collections.sort(Aobj);
        System.out.println("Sorted Array :" +Aobj);

        Aobj.add(1,"goat");
        System.out.println("Element of ArrayList are : "+Aobj);

        Aobj.add(3,"sheep");
        System.out.println("Element of ArrayList are : "+Aobj);


        String element = Aobj.get(0);
        System.out.println("Element of :" +Aobj.get(0));

        Aobj.set(0, "Elephant");
        System.out.println("Element of ArrayList are : "+Aobj);

        int index = Aobj.indexOf("Dog");
        System.out.println( +Aobj.indexOf("Dog"));

        int size = Aobj.size();

        Iterator<String> iterator = Aobj.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Aobj.remove(1);
        System.out.println("Element of ArrayList are :"+Aobj );

        Aobj.clear();
        System.out.println("Element of ArrayList are : "+Aobj);

    }

}