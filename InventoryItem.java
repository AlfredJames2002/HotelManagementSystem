package com.mycompany.hotelmanagement;

public class InventoryItem {
    private final String name;
    private int quantity;
    private double price;

    public InventoryItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public void updateQuantity(int amount) {
        quantity += amount;
    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

