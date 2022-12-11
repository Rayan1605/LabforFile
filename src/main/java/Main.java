import java.io.File;

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

    }
}
