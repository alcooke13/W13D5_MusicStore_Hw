package instruments;

import behaviors.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numOfStrings;

    public Guitar(InstrumentType instrumentType, String make, String color, int numOfStrings, double cost, double price) {
        super(instrumentType, make, color, cost, price);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return this.numOfStrings;
    }


    public String play() {
        return "Guitar sounds";
    }
}
