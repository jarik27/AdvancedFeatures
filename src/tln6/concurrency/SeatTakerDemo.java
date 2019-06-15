package tln6.concurrency;

public class SeatTakerDemo {
    public static void main(String[] args) throws InterruptedException {

        Bench bench = new Bench(10);
        SeatsTakerThread seatsTaker1=new SeatsTakerThread("seatsTaker1",bench);
        SeatsTakerThread seatsTaker2 =new SeatsTakerThread("seatsTaker2",bench);

        seatsTaker1.start();
        seatsTaker2.start();

    }
}
