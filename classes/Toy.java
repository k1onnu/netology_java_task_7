package classes;

public class Toy extends Product {

    protected String ageGroup;
    protected String material;

    public Toy() {
        super();
    }

    public Toy(String ageGroup, String material) {
        this.ageGroup = ageGroup;
        this.material = material;
    }

    public Toy(String name, Double price, String ageGroup, String material) {
        super(name, price);
        this.ageGroup = ageGroup;
        this.material = material;
    }

    public Toy(String name, Double price, Double weight, String manufacturer, String ageGroup, String material) {
        super(name, price, weight, manufacturer);
        this.ageGroup = ageGroup;
        this.material = material;
    }

    @Override
    public String getDescription() {
        return String.format("Игрушка: %s, Возрастная группа: %s, Материал: %s",
                name, ageGroup, material);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Возраст: %s, Материал: %s",
                ageGroup, material);
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
