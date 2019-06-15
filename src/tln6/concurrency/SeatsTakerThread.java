package tln6.concurrency;

public class SeatsTakerThread extends Thread {

    private Bench bench;

    public SeatsTakerThread(String name, Bench bench) {
        super(name);
        this.bench = bench;
    }

    @Override
    public void run() {
        bench.takeSeat(getName());
    }
}
