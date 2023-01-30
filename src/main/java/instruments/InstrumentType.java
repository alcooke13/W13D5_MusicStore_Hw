package instruments;

public enum InstrumentType {
    TRUMPET("Trumpet"),
    KEYBOARD("Keyboard"),
    GUITAR("Guitar");

    public final String type;

    InstrumentType(String type) {
        this.type = type;
    }

    public String getName(){
        return this.type;
    }
}
