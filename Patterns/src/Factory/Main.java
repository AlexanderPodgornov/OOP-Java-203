package Factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // �������� ������� ���� Circle � ������� �������
        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        circle.draw();

        // �������� ������� ���� Rectangle � ������� �������
        Shape rectangle = shapeFactory.createShape(ShapeType.RECTANGLE);
        rectangle.draw();
    }
}