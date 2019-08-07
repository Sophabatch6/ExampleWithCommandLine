package File;

import java.io.File;

public class Example2 {
    public static void main(String[] args){
        File myObj = new File("d:/text.txt");
        if (myObj.exists()){
            System.out.println("File Name: "+myObj.getName());
            System.out.println("Absolute path: "+ myObj.getAbsolutePath());
            System.out.println("Readable: "+myObj.canRead());
            System.out.println("File size i bytes : "+myObj.length());
        }
        else {
            System.out.println("Ths file not exist.");
        }
    }
}
