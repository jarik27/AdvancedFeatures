package tln6.concurrency;

public class ThreadSleepDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start of main method");
        Thread.sleep(1000);
        System.out.println("After the first pause");
        Thread.sleep(2000);
        System.out.println("End of main method");
    }
}
