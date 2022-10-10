package ru.amakhov.hw6.Task2.product;

public class MyProducts {
    public int maxProteins;
    public int maxFats;
    public int maxCarbohydrates;
    public int maxCalories;
    public Product[] products;

    public MyProducts(int productCount) {
        if (productCount <= 0) {
            throw new IllegalArgumentException("productCount должно быть положительное число");
        }
        products = new Product[productCount];
    }

    public void addProduct(Product product) {

    }


  }
