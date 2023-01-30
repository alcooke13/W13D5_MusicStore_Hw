package instruments;

import behaviors.IPlay;

public class Keyboard extends Instrument {

    private int numOfKeys;

    public Keyboard(InstrumentType instrumentType, String make, String color, int numOfKeys, double cost, double price) {
        super(instrumentType, make, color, cost, price);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return this.numOfKeys;
    }

    public String play() {
        return "Keyboard sounds";
    }
}
