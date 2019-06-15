package tln6.concurrency;

public class StopWatchDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start of main method");
        Thread.sleep(100);
        StopWatchThread thread1 = new StopWatchThread("Thread 1");
        StopWatchThread thread2 = new StopWatchThread("Thread 2");
        thread1.start();
        thread2.start();
        System.out.println("After starting thread1");
        //Thread.sleep(5000);

        Thread thread3=new Thread(new StopWatchRunnable("Thread 3"));
        Thread thread4=new Thread(new StopWatchRunnable("Thread 4"));
        thread3.start();
        System.out.println("After starting thread3");
        thread4.start();
        System.out.println("After starting thread4");

        System.out.println("End of main method");

    }
}
