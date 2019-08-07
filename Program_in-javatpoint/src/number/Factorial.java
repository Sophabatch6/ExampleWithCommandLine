package number;

import java.util.Scanner;

public class Factorial {
    int result =1;
    Factorial(int number){
        int copynumber = number;
        while (number>0){
            result = result*number;
            number=number-1;
        }
        System.out.println("Result of factorial "+copynumber+" is " +result);
    }
}

class MainFactorial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Factorial F= new Factorial(input.nextInt());

    }
}