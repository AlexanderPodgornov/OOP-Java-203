package Atelier;

import Clothing.Clothing;

import java.util.List;

public class Atelier {
    public void dressMen(List<Clothing> clothing){
        for (Clothing cl : clothing){
            cl.dressMan();
        }
    }
    public void dressWomen  (List<Clothing> clothing){
        for (Clothing cl : clothing){
            cl.dressWoman();
        }
    }
}
