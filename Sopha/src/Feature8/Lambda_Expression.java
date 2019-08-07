package Feature8;

import java.util.ArrayList;
import java.util.List;

/*interface MyFunctionInterface{
    public String sayHello();
}
public class Lambda_Expression {
    public static void main(String[] args){
        MyFunctionInterface msg = () -> {
            return "Hello";
        };
        System.out.println(msg.sayHello());
    }
}*/
/*interface MyFunctionInterface{
    public int incrementByfive(int a);
}
class Lambda_Expression{
    public static void main(String[] args){
    MyFunctionInterface f = (num) -> num +5;
    System.out.println(f.incrementByfive(22));
    }
}*/
/*interface MyFunctionInterface{
    public String Concat(String a, String b);
}
public class Lambda_Expression{
    public static void main(String[] args){
        MyFunctionInterface s = (str1,str2) -> str1 + " "+str2;
            System.out.println("Result: "+s.Concat("Hello","World"));

    }
}*/
public class Lambda_Expression{
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Rick");
        list.add("Negan");
        list.add("Sopha");
        list.add("Eng");
        list.forEach(
                (names) ->System.out.println(names)
        );
    }
}



