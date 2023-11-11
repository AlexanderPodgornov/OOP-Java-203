import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskA a = new TaskA();
        TaskB b = new TaskB();
        a.number1();
        a.number2();
        a.number3();
        b.getEvenNumbersPro(List.of(1,2,3,4,5));
        b.NamesPro(List.of("dgor", "dax", "ivan", "petr", "patric","dima","dasha"), 'd');
    }
}