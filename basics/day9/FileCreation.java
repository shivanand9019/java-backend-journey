
import java.io.File;
import java.io.IOException;


public class FileCreation {
    public static void main(String[] args) {
        File fw = new File("file.txt");
        try {
            fw.createNewFile();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
    
}
