package number;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args){
        int radios ;
        double value,pie= 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Radios: ");
        radios = input.nextInt();
        value = 4.0/3.0 * pie * radios * radios * radios;
        System.out.println("Ratios is :"+value);

    }
}
