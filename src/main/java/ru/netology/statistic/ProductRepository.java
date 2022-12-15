package ru.netology.statistic;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    List<Product> products = new ArrayList<>();

    public void insert(Product product)
    {
        products.add(product);
    }

    public void remove(int id){
        Product product = null;
        for (Product product1 : products){
            if (product != null) continue;
            if (product1.getID() == id) product = product1;
        }
        products.remove(product);
    }

    public List<Product> findAll(){
        return  products;
    }
}
