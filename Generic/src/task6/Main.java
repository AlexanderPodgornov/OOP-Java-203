package task6;

public class Main {
    public static void main(String[] args) {
        Gen<String,Animal,Integer> test = new Gen<>("Самовар", new Animal(), 2209);
        test.printClassNames();
    }
}
