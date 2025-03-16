//Задание 7: Управление заказами
//Создайте классы Product (товар) и Order (заказ).
//Product должен содержать поля: name (название), price (цена).
//Order должен содержать список товаров (List<Product>)
// и метод getTotalPrice(), который вычисляет общую стоимость заказа.
//Создайте несколько товаров, добавьте их в заказ,
// посчитайте итоговую сумму и выведите результат.

import java.util.ArrayList;
import java.util.List;

// Класс Product (товар)
class Product {
    private String name;
    private double price;

    // Конструктор
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Метод для получения цены товара
    public double getPrice() {
        return price;
    }

    // Метод для получения названия товара
    public String getName() {
        return name;
    }
}

// Класс Order (заказ)
class Order {
    private List<Product> products; // Список товаров в заказе

    // Конструктор (создает пустой заказ)
    public Order() {
        this.products = new ArrayList<>();
    }

    // Метод для добавления товара в заказ
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Добавлен товар: " + product.getName() + " - " + product.getPrice() + " руб.");
    }

    // Метод для вычисления общей стоимости заказа
    public double getTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

// Главный класс программы
public class Main7 {
    public static void main(String[] args) {
        // Создаем несколько товаров
        Product product1 = new Product("Ноутбук", 75000);
        Product product2 = new Product("Смартфон", 40000);
        Product product3 = new Product("Пылесос", 5000);

        // Создаем заказ
        Order order = new Order();

        // Добавляем товары в заказ
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        // Вычисляем и выводим итоговую сумму
        System.out.println("Общая стоимость заказа: " + order.getTotalPrice() + " руб.");
    }
}
