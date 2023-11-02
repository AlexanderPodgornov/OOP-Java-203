package Enums;

public enum euroSize {
    L(40),
    M(38),
    S(36),
    XS(34),
    XXS(32);
    private int euroSize;

    euroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(){
        if (this == XXS) return "Детский размер";
        else return "Мужской размер";
    }

}
