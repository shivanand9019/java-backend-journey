
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;


class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private int rollno;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
}
public class SerializationDemo{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(101);
        s1.setRollno(202);
        //Serialization
        String filename = "student.ser";
        try{
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(s1);
            out.close();
            file.close();
            System.out.println("Object Saved in file");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        

        //Deserialization
        Student s2 = null;
        String filename2 = "student.ser";
        try{
            
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            s1 = (Student)in.readObject();
            in.close();
            file.close();
            System.out.println("Object Read from file");
            System.out.println("Id: " + s1.getId());
            System.out.println("Roll No: " + s1.getRollno());
        }catch(FileNotFoundException e){
            e.printStackTrace();  

        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
    }
}
}