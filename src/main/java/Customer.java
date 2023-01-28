import instruments.Instrument;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;

    private ArrayList<Instrument> instrumentCollection;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.instrumentCollection = new ArrayList<Instrument>();
    }

    public String getName() {
        return this.name;
    }

    public double getMoney() {
        return this.money;
    }

    public int getInstrumentCount(){
        return this.instrumentCollection.size();
    }

    public void reduceMoney(double amount){
        this.money -= amount;
    }
}
