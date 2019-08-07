package Task_In_Class;

class joinMethod extends Thread{
    public void run(){
        for (int i =1 ; i<=5 ;i+=2){
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class joinMethod2 extends Thread{
    public void run(){
        for (int i = 2 ;i<5; i+=2){
            try{
                Thread.sleep(750);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
class MainClass{
    public static void main(String[] args){
        joinMethod J1 = new joinMethod();
        joinMethod2 J2 = new joinMethod2();

        try{
            J1.join();
        }catch (Exception e){
            System.out.println(e);

        }
        J1.start();
        J2.start();


    }
}
