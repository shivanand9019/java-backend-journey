

public class ExceptionHandlingDemo {
    public static void divison(int a,int b){

        try{
            int result = a/b;
            System.out.println("Result: "+result);
        }
        catch(ArithmeticException e){
            System.out.println("Error : Divison by zero is not possible"+e.getMessage());
    
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
    public static void main(String[] args) {
        divison(10,3);
        divison(2,0);
    }
    
}
