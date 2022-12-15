package ru.netology.statistic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    ProductRepository repository;

    @BeforeEach
    void setUp(){
        repository = new ProductRepository();
        repository.insert(new Product(1,"",1.0f));
    }

    @Test
    void insert() {

        assertEquals(1, repository.findAll().size());
    }

    @Test
    void remove() {
        repository.remove(0);
        assertEquals(1, repository.findAll().size());
        repository.remove(1);
        assertEquals(0, repository.findAll().size());
    }
}