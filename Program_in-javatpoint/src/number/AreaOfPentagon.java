package number;

import java.util.Scanner;

public class AreaOfPentagon {
    public static void main(String[] args){
        int a, s;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length A: ");
        a = input.nextInt();
        System.out.println("Enter length S: ");
        s = input.nextInt();
        result = 5.0/2.0 *a *s;
        System.out.println("Area of Pentagon is : "+result);


    }
}
