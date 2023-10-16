package shape;

import color.Color;

public class Triangle extends Shape{
    private Point point1;
    private Point point2;
    private Point point3;
    private double sp(Point a, Point b, Point c) {
        return (b.getX() - a.getX()) * (c.getY() - b.getY()) - (c.getX() - b.getX()) * (b.getY() - a.getY());
    }

    private void validate() {
        if (sp(point1, point2, point3) == 0) {
            throw new RuntimeException("НЕ УДАЛОСЬ СОЗДАТЬ ФИГУРУ, Т.К. ТОЧКИ ЛЕЖАТ НА ОДНОЙ ПРЯМОЙ");
        }
    }
    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        validate();
    }
    public Triangle(){
    }
    @Override
    public double getSquare() {
        return  0.5 * Math.abs((point1.getX() - point3.getX()) * (point2.getY() - point1.getY()) - (point1.getX() - point2.getX()) * (point3.getY() - point1.getY()));
    }

    @Override
    public double getPerimetr() {
        double side1 = Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2));
        double side2 = Math.sqrt(Math.pow(point3.getX() - point2.getX(), 2) + Math.pow(point3.getY() - point2.getY(), 2));
        double side3 = Math.sqrt(Math.pow(point1.getX() - point3.getX(), 2) + Math.pow(point1.getY() - point3.getY(), 2));
        return side1 + side2 + side3;
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
        this.point1 = new Point(point1.getX() + moveX, point1.getY() + moveY);
        this.point2 = new Point(point2.getX() + moveX, point2.getY() + moveY);
        this.point3 = new Point(point3.getX() + moveX, point3.getY() + moveY);
    }

    @Override
    public void draw() {
        System.out.println("Фигура: треугольник");
        System.out.println("Центр треугольника: - ");
        System.out.println("Радиус треугольника: - ");
        System.out.println("Площадь треугольника: " + getSquare());
        System.out.println("Периметр треугольника: " + getPerimetr());
        System.out.println("Цвет треугольника: " + getColor());
    }
}
