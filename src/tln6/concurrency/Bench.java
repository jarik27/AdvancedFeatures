package tln6.concurrency;

public class Bench {

    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public synchronized void takeSeat(String name){ //synchronized - chtoby operacija ne vypolnjalas odnovremenno dvumja ljudmi
        if (availableSeats>0){
            System.out.println(name + " Assigning seat to next person");
            availableSeats--;
            System.out.println(name + " There are " + availableSeats + " left.");
        }
        else {
            System.out.println(name + " There are no free seats");
        }
    }
}
