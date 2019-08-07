public class Copy_Constructor {
    String web;
    Copy_Constructor(String w){
        web = w;
    }
    Copy_Constructor(Copy_Constructor c){
        web = c.web;
    }
    void disp()
    {
        System.out.println("Website: " +web);
    }
    public static void main(String[] args){
        Copy_Constructor C1 = new Copy_Constructor("Sopha");
        Copy_Constructor C2 = new Copy_Constructor(C1);
        C1.disp();
        C2.disp();
        
    }
}

