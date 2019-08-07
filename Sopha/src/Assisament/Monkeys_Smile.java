package Assisament;

public class Monkeys_Smile {
    void Monkeys_Smile(boolean aSmile, boolean bSmile){
        if (aSmile==bSmile){
            System.out.println("Both Are Smile");
        }
        else {
            System.out.println("Both Are Not Happy");
        }
    }
}
class MainClass{
    public static void main(String[] args){
        Monkeys_Smile M = new Monkeys_Smile();
        M.Monkeys_Smile(true,false);
        M.Monkeys_Smile(true,true);
    }
}
