package classes;

import interfaces.Storable;

public abstract class FoodProduct extends Product implements Storable {
    protected String expirationDate;
    protected boolean requiresRefrigeration;
    protected double nutritionalValue;

    public FoodProduct() {
        super();
        this.expirationDate = "Не указано";
        this.requiresRefrigeration = false;
        this.nutritionalValue = 0.0;
    }

    public FoodProduct(String name, Double price, String expirationDate, boolean requiresRefrigeration) {
        super(name, price);
        this.expirationDate = expirationDate;
        this.requiresRefrigeration = requiresRefrigeration;
        this.nutritionalValue = 0.0;
    }

    public FoodProduct(String name, Double price, Double weight, String manufacturer,
                       String expirationDate, boolean requiresRefrigeration, double nutritionalValue) {
        super(name, price, weight, manufacturer);
        this.expirationDate = expirationDate;
        this.requiresRefrigeration = requiresRefrigeration;
        this.nutritionalValue = nutritionalValue;
    }

    @Override
    public void store() {
        if (requiresRefrigeration) {
            System.out.println("Продукт '" + name + "' хранится в холодильнике до " + expirationDate);
        } else {
            System.out.println("Продукт '" + name + "' хранится в шкафу до " + expirationDate);
        }
    }

    @Override
    public void use() {
        System.out.println("Употребляем продукт: " + name);
    }

    @Override
    public String getDescription() {
        return String.format("Продукт: %s, Срок годности: %s, Питательная ценность: %.1f ккал",
                name, expirationDate, nutritionalValue);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Срок годности: %s, Охлаждение: %s, Питательность: %.1f",
                expirationDate, requiresRefrigeration ? "Да" : "Нет", nutritionalValue);
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isRequiresRefrigeration() {
        return requiresRefrigeration;
    }

    public void setRequiresRefrigeration(boolean requiresRefrigeration) {
        this.requiresRefrigeration = requiresRefrigeration;
    }

    public double getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(double nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }
}