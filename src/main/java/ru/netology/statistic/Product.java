package ru.netology.statistic;

public class Product {
    private int ID;
    private String name;
    private float price;

    public Product(int ID, String name, float price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
}
