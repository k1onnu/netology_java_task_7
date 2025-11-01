package classes;

public class DairyProduct extends FoodProduct {

    protected double fatContent;      // жирность в %
    protected String dairyType;

    public DairyProduct() {
        super();
        this.fatContent = 0.0;
        this.dairyType = "Не указано";
    }

    public DairyProduct(String name, Double price, String expirationDate,
                        boolean requiresRefrigeration, double fatContent, String dairyType) {
        super(name, price, expirationDate, requiresRefrigeration);
        this.fatContent = fatContent;
        this.dairyType = dairyType;
    }

    @Override
    public String getDescription() {
        return String.format("Молочный продукт: %s (%s), Жирность: %.1f%%, Срок: %s",
                name, dairyType, fatContent, expirationDate);
    }

    @Override
    public void use() {
        System.out.println("Употребляем молочный продукт: " + name + " (" + dairyType + ")");
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public String getDairyType() {
        return dairyType;
    }

    public void setDairyType(String dairyType) {
        this.dairyType = dairyType;
    }
}
