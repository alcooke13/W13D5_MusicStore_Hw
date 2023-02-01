import behaviors.ISell;
import instruments.Instrument;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class MusicShop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;

    public MusicShop(String name, double till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return this.name;
    }

    public double getTill() {
        return this.till;
    }

    public void addToTill(double amount){
        this.till += amount;
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addToStock(ISell item){
        this.stock.add(item);
    }

    public void removeFromStock(ISell item){
        this.stock.remove(item);
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int countPotentialProfit() {
        int profit = 0;
        for(ISell item : this.stock){
            profit += item.markUp();
        }
        return profit;
    }

    public void sell(Customer customer, ISell item){
        if(customer.canBuy(item)){
            this.removeFromStock(item);
            this.addToTill(item.getPrice());
        }
    }

    public ISell findCheapest(){
       ISell cheapest = this.stock.get(0);
        for(ISell item : this.stock){
            if(item.getPrice() < cheapest.getPrice()){
                cheapest = item;
            }
        }
        return cheapest;
    }

}
