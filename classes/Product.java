package classes;

import interfaces.Usable;

public abstract class Product implements Usable {

    protected String name;
    protected Double price;
    protected Double weight;
    protected String manufacturer;

    public Product() {
        this("Неизвестно", 0.0, 0.0, "Неизвестно");
    }

    public Product(String name, Double price) {
        this(name, price, 0.0, "Неизвестно"); // вызов другого конструктора
    }

    public Product(String name, Double price, Double weight, String manufacturer) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.manufacturer = manufacturer;
    }

    public abstract String getDescription();

    @Override
    public void use() {
        System.out.println("Используется товар: " + name);
    }

    @Override
    public String toString() {
        return String.format("Товар: %s, Цена: %.2f, Вес: %.2f, Производитель: %s",
                name, price, weight, manufacturer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
