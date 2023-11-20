import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
public class Main {
    public static void main(String[] args) {
        FileWriter myFile;
        String filename = "filegoober.txt";


        /*   try {
               myFile = new FileWriter("Filegoober.txt");
               myFile.append("Edmond fr fr fr");
               myFile.close();
           } catch (IOException e) {
               System.out.println("An error has occured");
           }*/

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true)){

        }
        catch (IOException e) {

        }
}