package ru.netology.statistic;

import java.util.ArrayList;

public class ProductManager {
    // добавьте необходимые поля, конструкторы и методы

    ProductRepository repository = new ProductRepository();

    public void add(Product product){

        repository.insert(product);
    }

    public Product[] searchBy(String text) {
        ArrayList<Product> res = new ArrayList<>();
        for (Product product: repository.findAll()) {
            if (matches(product, text)) {

                res.add(product);
                // "добавляем в конец" массива result продукт product
            }
        }
        Product[] result = res.toArray(new Product[0]);
        return result;
    }

    // метод определения соответствия товара product запросу search
    public boolean matches(Product product, String search) {
         return product.getName().contains(search);
    }
}
