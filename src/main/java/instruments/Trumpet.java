package instruments;

import behaviors.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int numOfValves;

    public Trumpet(InstrumentType instrumentType, String make, String color, int numOfValves, double cost, double price) {
        super(instrumentType, make, color, cost, price);
        this.numOfValves = numOfValves;

    }

    public int getNumOfValves() {
        return this.numOfValves;
    }

    public String play() {
        return "Trumpet sounds";
    }
}
