import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0,1); // adds 1 in 0 index
        l1.add(1,2); //add 2 at index 1
        l1.add(2,3); //
        System.out.println(l1);

        //creating another list
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(2);
        l2.add(3);
        l2.add(4);
        //add 12 from index 1
        l1.addAll(1,l2);
        System.out.println(l1);

        //remove element
        l1.remove(1);
        System.out.println((l1));

        //print element from index 3
        System.out.println(l1.get(3));

        //change element at an index
        l1.set(0,5);
        System.out.println(l1);
    }
}

