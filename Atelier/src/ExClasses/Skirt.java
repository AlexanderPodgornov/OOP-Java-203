package ExClasses;

import Clothing.Clothing;
import Enums.Color;
import Enums.euroSize;
import Interfaces.Womensclothing;

public class Skirt extends Clothing implements Womensclothing {
    private int price;
    private euroSize euroSize;
    private Color color;
    public Skirt(int price, euroSize euroSize, Color color){
        this.price = price;
        this.euroSize = euroSize;
        this.color = color;
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надела юбку, цена = " + this.price + ", размер = " + this.euroSize + " , цвет - " + this.color);
    }

}
