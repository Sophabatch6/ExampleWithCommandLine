package Practice_test;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;

public class Phone_Book {



}


class MainCass{
    public static void main(String[] args){
        Phone_Book Book = new Phone_Book();
        Scanner inputString = new Scanner(System.in);
        Scanner inputInteger = new Scanner(System.in);
        Map<String, Integer> dictionary = new HashMap<String, Integer>();
        System.out.println("Welcome Dear!!!! ");
        while(true) {
            String key = inputString.nextLine();
            System.out.println(key);
            if (key == "Exit")break;
            else {
                int value = 0;
                try {
                    value = inputInteger.nextInt();
                } catch (Exception e) {
                }
                dictionary.put(key, value);
            }

        }
        System.out.println("Exit");
        String output = inputString.nextLine();
        System.out.println(dictionary.get(output));
    }
}
