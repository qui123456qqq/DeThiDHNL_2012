package Ex_2;

public abstract class Vehicle {
    private String model;
    private int madeYear;
    private double price;
    private Manufactor manufactor;

    public Vehicle(String model, int madeYear, double price, Manufactor manufactor) {
        this.model = model;
        this.madeYear = madeYear;
        this.price = price;
        this.manufactor = manufactor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMadeYear() {
        return madeYear;
    }

    public void setMadeYear(int madeYear) {
        this.madeYear = madeYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Manufactor getManufactor() {
        return manufactor;
    }

    public void setManufactor(Manufactor manufactor) {
        this.manufactor = manufactor;
    }

    public String toString() {
        return "Xe du lịch " + model + ", " + madeYear + ", " +
                price + " USD " + manufactor.toString();
    }

    public abstract double discount();
}

