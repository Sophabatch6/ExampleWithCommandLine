package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:/text.txt");
        Scanner user = new Scanner(System.in) ;
        FileWriter userWrite = new FileWriter(file,true);
        userWrite.write(user.nextLine());
        userWrite.close();
        Scanner Read = new Scanner(file);
        while(Read.hasNextLine()){
            String data = Read.nextLine();

            System.out.println(data);
        }

    }
}
