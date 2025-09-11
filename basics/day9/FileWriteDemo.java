
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo{
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file.txt");
            fw.write("Hello ,this is Day 9 learning\n");
            fw.write("File Handling in java is fun");
            System.out.println("Successfully written to the file");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error in writing");
            e.printStackTrace();
        }
    }
}