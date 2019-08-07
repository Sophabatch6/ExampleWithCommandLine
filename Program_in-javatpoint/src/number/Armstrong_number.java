package number;

import java.util.Scanner;

public class Armstrong_number {
    int result = 0, digit = 0;

    Armstrong_number(int number){
        int number1 = number;
        int number2 = number;
        while (number1> 0){
             number1 = number1/10;
             digit = digit +1;
        }
        System.out.println(digit);
        while (number > 0){
            result = (int) (result + Math.pow(number%10,digit));
            System.out.println(result);
            number = number/10;
        }
        if (result == number2){
            System.out.println(result+" Is Armstrong number");
        }
        else{
            System.out.println(result+" Is ot Armstrong number");
        }
    }
}

class MainArmstrong_number{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Armstrong_number A = new Armstrong_number(input.nextInt());
    }

}
