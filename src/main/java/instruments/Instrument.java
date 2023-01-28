package instruments;

public abstract class Instrument {

    private InstrumentType instrumentType;
    private String make;
    private String color;
    private double cost;
    private double price;

    public Instrument(InstrumentType instrumentType, String make, String color, double cost, double price) {
        this.instrumentType = instrumentType;
        this.make = make;
        this.color = color;
        this.cost = cost;
        this.price = price;

    }

    public InstrumentType getInstrumentType() {
        return this.instrumentType;
    }

    public String getMake() {
        return this.make;
    }

    public String getColor() {
        return this.color;
    }

    public double getCost() {
        return this.cost;
    }

    public double getPrice() {
        return this.price;
    }
}
