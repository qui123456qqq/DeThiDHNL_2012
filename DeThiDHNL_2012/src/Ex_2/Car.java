package Ex_2;

public class Car extends Vehicle{
    private int noSeats;
    private int maxSpeed;
    private int fuelPer100km;

    public int getNoSeats() {
        return noSeats;
    }

    public void setNoSeats(int noSeats) {
        this.noSeats = noSeats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getFuelPer100km() {
        return fuelPer100km;
    }

    public void setFuelPer100km(int fuelPer100km) {
        this.fuelPer100km = fuelPer100km;
    }

    public Car(String model, int madeYear, double price, Manufactor manufactor, int noSeats, int maxSpeed, int fuelPer100km) {
        super(model, madeYear, price, manufactor);
        this.noSeats = noSeats;
        this.maxSpeed = maxSpeed;
        this.fuelPer100km = fuelPer100km;

    }

    @Override
    public String toString() {
        return super.toString() + ", " +noSeats +" chỗ, tốc độ tối đa " +
                maxSpeed+", " + fuelPer100km +"lít/100km\n";
    }

    @Override
    public double discount() {
        return getPrice();
    }
}
