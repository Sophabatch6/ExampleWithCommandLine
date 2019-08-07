package number;

import java.util.Scanner;

class Prime_number {
    static int i=0;
    boolean re=false;
    Prime_number(int number){
        if (number ==0 | number==1){
            System.out.println(number+" Is not prime number!!!!!");
        }
        else {
            for (i = 2; i < number; i++) {
                System.out.println(i);
                if (number%i==0){
                    System.out.println(number+ " Is not Prime number!!!!!!");
                    break;
                }
                else {re= true; break;
                }
            }
        }
        if (re){
            System.out.println(number+ " Is prime number!!!");
        }

    }

}
class MainPrimeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Prime_number P = new Prime_number(input.nextInt());



    }
}
