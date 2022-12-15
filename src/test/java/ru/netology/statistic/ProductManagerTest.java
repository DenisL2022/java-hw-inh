package ru.netology.statistic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    ProductManager manager;

    @BeforeEach
    void setUp(){
        manager = new ProductManager();
    }

    @Test
    void add() {

        manager.add(new Book(1,"test", 1.f,""));
        manager.add(new Smartphone(1,"11", 1.f,""));
        assertEquals(1,manager.searchBy("test").length);
    }
}