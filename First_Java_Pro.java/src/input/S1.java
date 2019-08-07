package input;

public class S1{
    int result;
    S1(int a, int b){
        result = a + b;
    }
}
class S2 extends S1{
    int result1;
    S2(int a, int b , int c ){
        super(a, b);
        result1 = c + result;
    }
    public void show(){
        System.out.println(result1);
    }
}
class Mainclass{
    public static void main(String[] args){
        S2 S = new S2(1,2,3);
        S.show();

    }
}