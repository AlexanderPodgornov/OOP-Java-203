package Bridge;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape blueCircle = new Circle(100,100, 10, new BlueCircle());
        redCircle.draw();
        blueCircle.draw();
    }
}