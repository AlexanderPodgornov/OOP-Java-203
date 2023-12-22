package Adapter;

public class AdapteR implements Target {
    private Adapter.Adaptee adaptee;

    public AdapteR (Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}