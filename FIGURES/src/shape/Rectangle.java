package shape;

import color.Color;

public class Rectangle extends Shape{
    private Point point1;
    private Point point2;
    private void validate(){
        if (point1.getY() == point2.getY() || point1.getX() == point2.getX())
            throw new RuntimeException("НЕ УДАЛОСЬ СОЗДАТЬ ФИГУРУ, Т.К. ТОЧКИ ЛЕЖАТ НА ОДНОЙ ПРЯМОЙ");
    }
    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
        validate();
    }
    public Rectangle(){
    }
    @Override
    public double getSquare() {
        return Math.abs(point1.getX() - point2.getX()) * Math.abs((point1.getY() - point2.getY()));
    }

    @Override
    public double getPerimetr() {
        return 2 * (Math.abs(point1.getX() - point2.getX()) + Math.abs(point1.getY() - point2.getY()));
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
    }

    @Override
    public void draw() {
        System.out.println("Фигура: прямоугольник");
        System.out.println("Центр прямоугольника: - ");
        System.out.println("Радиус прямоугольника: - ");
        System.out.println("Площадь прямоугольника: " + getSquare());
        System.out.println("Периметр прямоугольника: " + getPerimetr());
        System.out.println("Цвет прямоугольника: " + getColor());
    }
}
