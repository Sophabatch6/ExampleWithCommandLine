
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //Creating HashSet and adding elements
        HashSet<Integer> set=new HashSet();
        set.add(40);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(50);
        System.out.println(set);
        Iterator<Integer> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        System.out.println(set);
    }
}