package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args){
        try{
            File myObj = new File("d:/text.txt");
            FileWriter myWriter = new FileWriter(myObj);
            myWriter.write("Eng sopha");
            myWriter.close();
        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
