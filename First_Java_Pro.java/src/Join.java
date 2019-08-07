public class Join extends join1{
    public static void main(String[] args){
        join1 t1= new join1();
        join1 t2= new join1();
        join1 t3= new join1();
        t1.start();
        try {
            t1.join();
        }catch (Exception e){
            System.out.println();
        }
        t3.start();
    }
}
