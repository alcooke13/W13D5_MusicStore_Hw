package shopItems;

import behaviors.ISell;

public abstract class Product implements ISell {

    private String productName;
    private double cost;
    private double price;

    public Product(String productName, double cost, double price) {
        this.productName = productName;
        this.cost = cost;
        this.price = price;
    }

    public String getProductName() {
        return this.productName;
    }

    public double getCost() {
        return this.cost;
    }

    public double getPrice() {
        return this.price;
    }

    public double markUp() {
        return this.price - this.cost;
    }
}
