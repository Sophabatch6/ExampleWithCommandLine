package input;
import java.util.Scanner;
public class Array {
    static int n;
    Scanner s = new Scanner(System.in);
    void Array(){
        System.out.println("Enter your number: ");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter number into Array");
        for (int i=0; i<n;i++){
            arr[i] = s.nextInt();
        }
        System.out.println("Output your enter: ");
        for (/*int i =0;i<n ;i++*/ int i : arr){
            System.out.println(i);
        }
    }

}
class MainClass{
    public static void main(String[] args){
        Array arr = new Array();
        arr.Array();
    }
}
