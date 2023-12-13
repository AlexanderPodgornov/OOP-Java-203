package task6;

import java.io.Serializable;

public class Gen<T extends Comparable<String>,V extends Animal,K extends Number>{
    private T t;
    private V v;
    private K k;
    public Gen(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }
    public T getT() {
        return t;
    }
    public V getV() {
        return v;
    }
    public K getK() {
        return k;
    }
    public void printClassNames() {
        System.out.println("Type of T: " + t.getClass().getName());
        System.out.println("Type of V: " + v.getClass().getName());
        System.out.println("Type of K: " + k.getClass().getName());
    }
}