package Singleton;

import Singleton.ST;

public class Main {
    public static void main(String[] args) {
        ST singleton1 = ST.getInstance();
        ST singleton2 = ST.getInstance();
        System.out.println(singleton1 + " " + singleton2);
    }
}