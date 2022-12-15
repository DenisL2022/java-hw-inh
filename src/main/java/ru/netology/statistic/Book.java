package ru.netology.statistic;

public class Book extends Product {

    public String author;

    public Book(int ID, String name, float price, String author) {
        super(ID, name, price);
        this.author = author;
    }
}
