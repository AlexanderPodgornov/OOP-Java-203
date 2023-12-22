package Bridge;

public class BlueCircle implements Draw {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: blue, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}