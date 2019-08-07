public class join1 extends Thread{
    public void run(){
        for (var i =0;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
                System.out.println(i);
            }
        }
    }
}
