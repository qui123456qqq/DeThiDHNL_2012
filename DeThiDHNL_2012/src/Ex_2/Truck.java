package Ex_2;

public class Truck extends Vehicle{
    private double loadingCap;

    public Truck(String model, int madeYear, double price, Manufactor manufactor, double loadingCap) {
        super(model, madeYear, price, manufactor);
        this.loadingCap = loadingCap;
    }

    public double getLoadingCap() {
        return loadingCap;
    }

    public void setLoadingCap(double loadingCap) {
        this.loadingCap = loadingCap;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + loadingCap +" tấn\n";
    }

    @Override
    public double discount() {
        return getPrice() *0.9;
    }
}
