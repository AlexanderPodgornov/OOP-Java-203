package Adapter;

public class Main {
    public static void main(String[] args) {
        // Создание объекта Adaptee
        Adaptee adaptee = new Adaptee();

        // Создание адаптера, который адаптирует интерфейс Adaptee к интерфейсу Target
        Target adapter = new AdapteR(adaptee);

        // Вызов метода request у объекта типа Target
        adapter.request();
    }
}