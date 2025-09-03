
class Person{
    String name;
    int age;
    
    void speak(){
        System.out.println("I am a person");
    }
}

class Teacher extends Person{
    String subject;
    void printDetails(String name,int age ,String subject){
        this.name = name;
        this.age = age;
        this.subject = subject;
        
    }
    
} 
public class TeacherDemo {
public static void main(String[] args) {

    Teacher t1 = new Teacher();
    t1.printDetails("Shyam",30,"Maths");
    System.out.println(t1.name);
    System.out.println(t1.age);
    System.out.println(t1.subject);
    t1.speak();
}   
}
