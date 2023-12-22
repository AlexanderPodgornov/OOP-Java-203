package Singleton;

public class ST {
    private static ST instance;
    private ST(){}
    public static ST getInstance(){
        if (instance == null){
            instance = new ST();
        }
        return instance;
    }
}