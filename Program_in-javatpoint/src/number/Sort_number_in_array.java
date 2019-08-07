package number;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.*;

public class Sort_number_in_array {
}
class MainSortNumberInArray{
    public static void main(String[] args){
        int member;
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Array: ");
        member = input.nextInt();
        System.out.println("Enter all those "+ member+ " number in array: ");
        for (int i = 0; i< member;i++){
            arrayList.add(input.nextInt());
        }
        System.out.println("The number of array before sort: ");
        System.out.println(arrayList);
        System.out.println("The array after sorted");
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}