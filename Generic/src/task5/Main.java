package task5;

public class Main {
    public static void main(String[] args) {
        Food food = new Food();
        food.prepare(new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("¬арка: " + str);
            }
            }, "€иц");
    }
}