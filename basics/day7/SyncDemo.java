class Counter {
    private int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class SyncDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();

        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                c1.increment();
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start(); 
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
        }
        System.out.println("Final count: " + c1.getCount());
        
    }
    
}
