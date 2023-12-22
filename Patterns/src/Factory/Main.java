package Factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Создание объекта типа Circle с помощью фабрики
        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        circle.draw();

        // Создание объекта типа Rectangle с помощью фабрики
        Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
        rectangle.draw();
    }
}