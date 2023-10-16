package impl;

import color.Color;
import service.ShapesService;
import shape.Shape;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShapesServiceImpl implements ShapesService {

    @Override
    public double getSquares(List<Shape> shapeList) {
        double sum = 0;
        for (Shape shape : shapeList) {
            sum = sum + shape.getSquare();
        }
        return sum;
    }

    @Override
    public double getMaxPerimeters(List<Shape> shapeList) {
        double maxperimeter = 0;
        for (Shape shape : shapeList){
            if (shape.getPerimetr() > maxperimeter) maxperimeter = shape.getPerimetr();
        }
        return maxperimeter;
    }

    @Override
    public Set<Color> getColors(List<Shape> shapeList) {
        Set<Color> setcolors = new HashSet<>();
        for (Shape shape: shapeList){
            setcolors.add(shape.getColor());
        }
        return setcolors;
    }
}
