package shape;

import color.Color;

import java.sql.SQLOutput;

public class Circle extends Shape{
    private Point point;
    private double radius = 0.0;

    private void validate(){
        if (radius <= 0) throw new RuntimeException("НЕ УДАЛОСЬ СОЗДАТЬ ФИГУРУ, ТАК КАК РАДИУС НЕ ЯВЛЯЕТСЯ ПОЛОЖИТЕЛЬНЫМ ЧИСЛОМ");
    }
    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
        validate();
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * radius;
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
        this.point.setX(moveX + point.getX());
        this.point.setY(moveY + point.getY());
    }



    @Override
    public void draw() {
        System.out.println("Фигура: круг");
        System.out.println("Центр круга: ( " + point.getX() + " , " + point.getY() + " )");
        System.out.println("Радиус круга: " + radius);
        System.out.println("Площадь круга: " + getSquare());
        System.out.println("Периметр круга: " + getPerimetr());
        System.out.println("Цвет круга: " + getColor());
    }
}
