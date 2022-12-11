import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    //File is an abstract representation of file and directory pathnames
    public static void main(String[] args) {
        File file = new File("message.txt");

        if (file.exists()){ // just to check if it exist in the same project folder
           System.out.println(file.getPath());
           System.out.println(file.getAbsoluteFile());
           System.out.println(file.length());
       }
       else{
           System.out.println("that file does not exist ");
       }
        try {
            PrintWriter writer = new PrintWriter( new FileWriter("message.txt",true));
            System.out.println();
            writer.println("I am one step away from finishing ");
            writer.close();
        } catch (IOException e) {  // Just in case  the  input failed .
            System.out.println("An error occurred   writing to file ");
            e.printStackTrace();
        }

    }
}
