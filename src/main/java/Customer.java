import behaviors.ISell;
import instruments.Instrument;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double money;

    private ArrayList<ISell> instrumentCollection;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.instrumentCollection = new ArrayList<ISell>();
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

    public boolean canBuy(ISell item){
        return item.getPrice() <= this.money;
    }

    public void buy(ISell item){
        this.money -= item.getPrice();
        this.addItemToCollection(item);
    }

    public void addItemToCollection(ISell item){
        this.instrumentCollection.add(item);
    }


}
