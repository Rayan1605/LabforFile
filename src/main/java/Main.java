import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        System.out.println("Enter the Filename");
        String filename =  myinput.nextLine();
        try {
            Scanner file = new Scanner( new File(filename));
            while (file.hasNextLine()){
                String data = file.nextLine();
                System.out.println(data);
            }
            file.close();
        } catch (FileNotFoundException e) {
            e.getMessage();
        }



    }
}
