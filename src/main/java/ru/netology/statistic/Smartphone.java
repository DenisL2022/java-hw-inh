package ru.netology.statistic;

public class Smartphone extends Product {
    public String manufacturer;

    public Smartphone(int ID, String name, float price, String manufacturer) {
        super(ID, name, price);
        this.manufacturer = manufacturer;
    }
}
