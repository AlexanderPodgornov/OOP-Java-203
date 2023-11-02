package Clothing;

import Enums.Color;
import Enums.euroSize;

public abstract class Clothing {
    private int price;
    private Color color;
    private euroSize eurosize;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public euroSize getEurosize() {
        return eurosize;
    }

    public void setEurosize(euroSize eurosize) {
        this.eurosize = eurosize;
    }
    public abstract void dressMan();
    public abstract void dressWoman();
}
