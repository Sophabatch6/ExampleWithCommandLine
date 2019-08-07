package File;

import java.io.File;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args){
        try{
            File myObj = new File("d:/text.txt");
            if (myObj.createNewFile()){
                System.out.println("File create: "+myObj.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
