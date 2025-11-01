import classes.Product;
import classes.Toy;
import classes.DairyProduct;

import interfaces.Storable;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Добавляем экземпляры наследников
        products.add(new Toy("Конструктор", 1500.0, 0.5, "LEGO", "6+", "Пластик"));
        products.add(new Toy("Мягкая игрушка", 800.0, 0.3, "Hasbro", "3+", "Ткань"));
        products.add(new Toy("Пазл", 450.0, 0.2, "Ravensburger", "8+", "Картон"));

        products.add(new DairyProduct("Молоко", 85.0, "15.12.2024", true, 3.2, "Молоко"));
        products.add(new DairyProduct("Йогурт", 45.0, "20.12.2024", true, 2.5, "Йогурт"));
        products.add(new DairyProduct("Сыр", 320.0, "25.12.2024", true, 45.0, "Сыр"));

        System.out.println("=== ВСЕ ПРОДУКТЫ ===");
        for (Product product : products) {
            System.out.println(product.toString());
        }

        //полиморфизм
        System.out.println("\n=== ПОЛИМОРФИЗМ (getDescription()) ===");
        for (Product product : products) {
            System.out.println(product.getDescription()); // Полиморфный вызов!
        }

        // поиск по критериям
        System.out.println("\n=== ПОИСК ПРОДУКТОВ ДО 500 РУБ ===");
        List<Product> cheapProducts = findByMaxPrice(products, 500.0);
        for (Product p : cheapProducts) {
            System.out.println(p.getDescription() + " - " + p.getPrice() + " руб");
        }

        System.out.println("\n=== ПОИСК ИГРУШЕК ДЛЯ ВОЗРАСТА 6+ ===");
        List<Toy> toysForAge = findToysByAgeGroup(products, "6+");
        for (Toy toy : toysForAge) {
            System.out.println(toy.getDescription());
        }

        System.out.println("\n=== ПОИСК МОЛОЧНЫХ ПРОДУКТОВ С ВЫСОКОЙ ЖИРНОСТЬЮ ===");
        List<DairyProduct> highFatProducts = findDairyByMinFat(products, 10.0);
        for (DairyProduct dp : highFatProducts) {
            System.out.println(dp.getDescription());
        }

        // instanceof и вызов методом интерфейса
        System.out.println("\n=== ВЫЗОВ МЕТОДОВ ИНТЕРФЕЙСОВ ===");
        for (Product product : products) {
            System.out.println("\n--- " + product.getName() + " ---");

            // Все продукты реализуют Usable
            System.out.print("Usable: ");
            product.use();

            // Проверка на Storable
            if (product instanceof Storable) {
                System.out.print("Storable: ");
                ((Storable) product).store();
            } else {
                System.out.println("Не реализует Storable");
            }
        }
    }


    // Поиск по максимальной цене
    public static List<Product> findByMaxPrice(List<Product> products, double maxPrice) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() <= maxPrice) {
                result.add(product);
            }
        }
        return result;
    }

    // Поиск игрушек по возрастной группе
    public static List<Toy> findToysByAgeGroup(List<Product> products, String ageGroup) {
        List<Toy> result = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof Toy toy) {
                if (toy.getAgeGroup().equals(ageGroup)) {
                    result.add(toy);
                }
            }
        }
        return result;
    }

    // Поиск молочных продуктов по минимальной жирности
    public static List<DairyProduct> findDairyByMinFat(List<Product> products, double minFat) {
        List<DairyProduct> result = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof DairyProduct dairy) {
                if (dairy.getFatContent() >= minFat) {
                    result.add(dairy);
                }
            }
        }
        return result;
    }

    // Дополнительный метод поиска по производителю
    public static List<Product> findByManufacturer(List<Product> products, String manufacturer) {
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getManufacturer().equalsIgnoreCase(manufacturer)) {
                result.add(product);
            }
        }
        return result;
    }
}
