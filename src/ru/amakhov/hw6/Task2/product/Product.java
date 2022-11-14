package ru.amakhov.hw6.Task2.product;

public class Product {
    public String nameProduct;
    public int proteins;
    public int fats;
    public int carbohydrates;
    public int calories;

    public Product(){
        this.nameProduct = nameProduct;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public Product(String nameProduct, int proteins, int fats, int carbohydrates, int calories){
        this.nameProduct = nameProduct;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }
    public Product(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void addProteins(){
        this.proteins = proteins;
    }

    public void addFats(){
        this.fats = fats;
    }

    public void addCarbohydrates(){
        this.carbohydrates = carbohydrates;
    }
    public void addCalories() {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", calories=" + calories +
                '}';
    }
}
