import Atelier.Atelier;
import Clothing.Clothing;
import Enums.Color;
import Enums.euroSize;
import ExClasses.Skirt;
import ExClasses.TShort;
import ExClasses.Trousers;
import ExClasses.Tie;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        TShort tshort = new TShort(1000, euroSize.S, Color.BLACK);
        tshort.dressMan();
        tshort.dressWoman();

        Skirt skirt = new Skirt(3000, euroSize.M, Color.RED);
        skirt.dressWoman();

        Trousers trousers = new Trousers(4000, euroSize.L, Color.GREEN);
        trousers.dressMan();
        trousers.dressWoman();

        Tie tie = new Tie(1000, euroSize.S, Color.BLUE);
        tie.dressMan();
        System.out.println("==========");

        Clothing[] clothing = {new Tie(1000, euroSize.S, Color.BLUE),
                               new Trousers(4000, euroSize.L, Color.GREEN),
                               new Skirt(3000, euroSize.M, Color.RED),
                               new TShort(1000, euroSize.S, Color.BLACK)};

        Atelier atelier = new Atelier();
        atelier.dressMen(List.of(clothing));
        System.out.println("=========");
        atelier.dressWomen(List.of(clothing));

    }
}
