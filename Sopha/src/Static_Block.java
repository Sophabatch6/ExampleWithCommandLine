public class Static_Block {
    static int num;
    static String name;
    static{// It can also used with multiple static block
        num = 97;
        name = "Sopha";
    }
    public static void main(String[] args){
        System.out.println(num);
        System.out.println(name);
    }
}
