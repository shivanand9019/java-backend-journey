

class MyThread extends Thread{
    @Override
    public void  run(){
        for(int i =0;i<18;i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}
public class ThreadsDemo{
   public static void main(String []args){
    MyThread t1 = new MyThread();
    MyThread t2 = new MyThread();
    t1.setName("Thread-1");
    t2.setName("Thread-2");
    t1.run();
    t2.run();


   }
}