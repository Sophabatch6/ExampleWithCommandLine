package number;

import java.util.Scanner;

public class Fibonacci_series {
    static int i=0,a=0,b=1,c=0;
    Fibonacci_series(int number){
        for (i=0;i<number;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
class MainFibonacciSeries{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("1");
        Fibonacci_series F = new Fibonacci_series(input.nextInt());
        System.out.println("Finish");
    }
}
