public class Overloading {
    public void disp(String a){// Static Polymorphism
        System.out.println(a);
    }
    public void disp(String a, int b){
        System.out.println("Name: "+a +", Age: "+ b);
    }
    public void Disp(){// Dynamic Polymorphism
            System.out.println("Default");
    }
}
class Display extends Overloading{
    public void Disp(){
        System.out.println("Eng Sopha");
    }
}
class MainClass1{
    public static void main(String[] args){
        Overloading O = new Overloading();
        Display D = new Display();
        O.disp("Song Heng");
        O.disp("Sopha" , 18);
        D.Disp();
    }
}
