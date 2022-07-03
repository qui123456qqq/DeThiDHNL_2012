package Ex_2;

public class Bus extends Vehicle{
    private int noSeats;

    public Bus(String model, int madeYear, double price, Manufactor manufactor, int noSeats) {
        super(model, madeYear, price, manufactor);
        this.noSeats = noSeats;
    }

    public int getNoSeats() {
        return noSeats;
    }

    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + noSeats + " chỗ\n" ;
    }

    @Override
    public double discount() {
        return getPrice() -1000;
    }
}
