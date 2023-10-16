import impl.ShapesServiceImpl;
import service.ShapesService;
import shape.*;
import color.Color;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* Point point = new Point(1,0);
        point.setColor(Color.BLACK);
        point.draw();
        System.out.println();
        point.move(2,1);
        point.draw();*/

        /*Circle circle = new Circle(new Point(3,4),10);
        circle.setColor(Color.BLUE);
        circle.draw();
        System.out.println();
        circle.move(4, 5);
        circle.draw();*/

        /*Rectangle rectangle = new Rectangle(new Point(1,1), new Point(8,8));
        rectangle.setColor(Color.TRANSPARENT);
        rectangle.draw();
        rectangle.setColor(Color.BLACK);
        System.out.println();
        rectangle.move(2,2);
        rectangle.draw();*/

        /*Triangle triangle = new Triangle(new Point(1,2), new Point(2,2), new Point(5,5));
        triangle.setColor(Color.GREEN);
        triangle.draw();
        triangle.setColor(Color.RED);
        System.out.println();
        triangle.move(2,-3);
        triangle.draw();*/


        Triangle redtriangle = new Triangle(new Point(0,0), new Point(0,4), new Point(4,0));
        redtriangle.setColor(Color.RED);

        Triangle bluetriangle = new Triangle(new Point(-2,3), new Point(4,3), new Point(2,5));
        bluetriangle.setColor(Color.BLUE);

        Circle whilecircle = new Circle(new Point(3,3), 2);
        whilecircle.setColor(Color.WHITE);

        Circle yellowcircle = new Circle(new Point(2,5), 4);
        yellowcircle.setColor(Color.YELLOW);

        Rectangle rect = new Rectangle(new Point(1,1), new Point(5,2));

        Point point = new Point(100,100);

        List<Shape> shapes = new ArrayList<>();

        shapes.add(redtriangle);
        shapes.add(bluetriangle);
        shapes.add(whilecircle);
        shapes.add(yellowcircle);
        shapes.add(rect);
        shapes.add(point);

        ShapesServiceImpl shapesServiceimpl = new ShapesServiceImpl();
        System.out.println(shapesServiceimpl.getColors(shapes));
        System.out.println(shapesServiceimpl.getSquares(shapes));
        System.out.println(shapesServiceimpl.getMaxPerimeters(shapes));

        /** hello world! */


    }
}