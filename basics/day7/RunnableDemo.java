
class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
        
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(),"Runnable-1");
        Thread t2 = new Thread(new MyRunnable(),"Runnable-2");
        t1.run();
        t2.run();


    }
    
}
