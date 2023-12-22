package Bridge;

public abstract class Shape {
    protected Draw draw;

    protected Shape(Draw draw){
        this.draw = draw;
    }

    public abstract void draw();
}