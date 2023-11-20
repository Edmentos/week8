import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        FileWriter myFile;

        {
            try {
                myFile = new FileWriter("Filegoober.txt");
                myFile.write("Good Evening!");
                myFile.append("\nEdmond fr");
                myFile.close();
            } catch (IOException e) {
                System.out.println("An error has occured");
            }
        }

    }
}