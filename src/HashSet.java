

import java.util.HashSet;
import java.util.Iterator;

class HS
{
    public static void main(String arg[])
    {

        HashSet<Integer> marks = new HashSet<>();

        marks.add(60);
        marks.add(70);
        marks.add(80);
        marks.add(66);
        marks.add(60);

        System.out.println("Hashset :"+marks);

        if(marks.contains(70))
        {
            System.out.println("set contains 70");
        }
        if(marks.contains(75))
        {
            System.out.println("does not contain");
        }


        marks.remove(60);
        System.out.println("is 60 removed : ");

        System.out.println("size of Hashset is :" +marks.size());

        Iterator it = marks.iterator();


        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }

}
