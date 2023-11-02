package ExClasses;

import Clothing.Clothing;
import Enums.Color;
import Enums.euroSize;
import Interfaces.Mensclothing;
import Interfaces.Womensclothing;

public class TShort extends Clothing implements Womensclothing, Mensclothing {


    private int price;
    private euroSize euroSize;
    private Color color;
    public TShort(int price, euroSize euroSize, Color color){
        this.price = price;
        this.euroSize = euroSize;
        this.color = color;
    }
    @Override
    public void dressMan() {
        System.out.println("Мужчина надел футболку, цена = " + this.price + ", размер = " + this.euroSize + " , цвет - " + this.color);
    }
    @Override
    public void dressWoman() {
        System.out.println("Женщина надела футболку, цена = " + this.price + ", размер = " + this.euroSize + " , цвет - " + this.color);
    }
}
