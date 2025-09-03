class Student{
    String name;
    int rollno;
    void displayDetails(){
        System.out.println("Name: "+name+"Roll No: "+rollno);
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Ram";
        s1.rollno=104;
        s1.displayDetails();
    }
}
