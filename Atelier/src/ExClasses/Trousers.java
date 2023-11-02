package ExClasses;

import Clothing.Clothing;
import Enums.Color;
import Enums.euroSize;
import Interfaces.Mensclothing;
import Interfaces.Womensclothing;

public class Trousers extends Clothing implements Mensclothing, Womensclothing {
    private int price;
    private euroSize euroSize;
    private Color color;
    public Trousers(int price, euroSize euroSize, Color color){
        this.price = price;
        this.euroSize = euroSize;
        this.color = color;
    }
    @Override
    public void dressMan() {
        System.out.println("Мужчина надел брюки, цена = " + this.price + ", размер = " + this.euroSize + " , цвет - " + this.color);
    }
    @Override
    public void dressWoman() {
        System.out.println("Женщина надела брюки, цена = " + this.price + ", размер = " + this.euroSize + " , цвет - " + this.color);
    }
}
