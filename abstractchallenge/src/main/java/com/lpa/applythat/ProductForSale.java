package com.lpa.applythat;

public abstract class ProductForSale {
    protected String type, description;
    protected double price;

    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public double getSalesPrice(double quantity) {
        return quantity * this.price;
    }

    public void printPricedItem(double quantity) {
        System.out.printf("%2f qty at $%8.2f each, %-15s %-35s %n", quantity, price, type, description);
    }
    public abstract void showDetails();
}
