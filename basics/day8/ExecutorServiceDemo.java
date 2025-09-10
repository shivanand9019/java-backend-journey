import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(int i=1;i<=5;i++){
            int taskId = i;
            service.submit(() -> {
                System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
            });
        }
        service.shutdown();
    }
}
