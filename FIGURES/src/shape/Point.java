package shape;

import color.Color;

public class Point extends Shape{

    private double x = 0.0;
    private double y = 0.0;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(){}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getSquare() {
        return super.getSquare();
    }

    @Override
    public double getPerimetr() {
        return super.getPerimetr();
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public void move(double moveX, double moveY) {
        this.x = moveX + x;
        this.y = moveY + y;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: точка");
        System.out.println("Центр точки: ( " + getX() + " , " + getY() + " )");
        System.out.println("Радиус точки: " + "-");
        System.out.println("Площадь точки: " + "-");
        System.out.println("Периметр точки: " + "-");
        System.out.println("Цвет точки: " + getColor());
    }


}
