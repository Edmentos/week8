import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Specify the file name
        String fileName = "Filegoober.txt";

        //Create the file object
        File myFile = new File(fileName);

        try{
            //Create a new file on the disk
            if (myFile.createNewFile()) {
                System.out.println("File created successfully at " + myFile.getAbsolutePath());
            } else{
                System.out.println("File already exists at " + myFile.getAbsolutePath());
            }
        } catch (IOException e){
            System.out.println("An error has occured");
            e.printStackTrace();
        }

    }
}