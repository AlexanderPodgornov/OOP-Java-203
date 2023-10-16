package shape;

import color.Color;

public abstract class Shape {
    private Color color = Color.BLUE;


    public double getSquare(){
        return 0.0;
    }
    public double getPerimetr(){
        return 0.0;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void move(double moveX, double moveY){
    }
    public void draw(){
        System.out.println();
    }

}
