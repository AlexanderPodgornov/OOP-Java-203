package Adapter;

public class Main {
    public static void main(String[] args) {
        // �������� ������� Adaptee
        Adaptee adaptee = new Adaptee();

        // �������� ��������, ������� ���������� ��������� Adaptee � ���������� Target
        Target adapter = new AdapteR(adaptee);

        // ����� ������ request � ������� ���� Target
        adapter.request();
    }
}