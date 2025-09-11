
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class FileReadDemo {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt")))
           {
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }

            catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            
                e.printStackTrace();
            }
    }
    
}
