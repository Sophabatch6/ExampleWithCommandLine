import java.util.NavigableSet;
import java.util.TreeSet;

class Naviable{
    public static void main(String[] args){
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);
        ns.add(7);
        NavigableSet<Integer> Revers_ns = ns.descendingSet();
        System.out.println("Normal Set"+ns);
        System.out.println("Revers Navigable "+Revers_ns);
        NavigableSet<Integer> ThereOrMore = ns.tailSet(3, true);
        System.out.println("Three or More "+ThereOrMore);
        System.out.println("lower(3)"+ns.lower(3));
        System.out.println("Floor(3)"+ns.floor(3));
        System.out.println("Higher(4)"+ns.higher(4));
        System.out.println("ceiling(3)"+ns.ceiling(3));
        System.out.println("pollFirst() : "+ns.pollFirst());
        System.out.println("Normal Set" +ns);
        System.out.println("pollLast()"+ns.pollLast());
        System.out.println("Normal Set"+ns);
    }
}