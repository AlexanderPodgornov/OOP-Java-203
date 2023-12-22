package Factory;

public class ShapeFactory {
    public Shape createShape(ShapeType shapeType) {
        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            default -> null;
        };
    }
}