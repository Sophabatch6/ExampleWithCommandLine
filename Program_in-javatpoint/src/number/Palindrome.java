package number;

import java.util.Scanner;

public class Palindrome {
    static int revers, i=0;

    Palindrome(int number){
        int copynumber=number;
        while (number>0){
            revers = revers*10 + (number%10);
            number = number / 10;
            //System.out.println(number);
        }
        //System.out.println(revers);
        //System.out.println(number);
        if (revers == copynumber){
            System.out.println(copynumber+" Is palindrome");
        }
        else{
            System.out.println(copynumber+" Is not palindrome");
        }

    }
}
class MainPalidrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type any number: ");
        Palindrome P = new Palindrome(input.nextInt());


    }
}
