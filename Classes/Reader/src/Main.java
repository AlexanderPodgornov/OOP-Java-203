public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("������ �. �.", 12345, "������", "01.01.1990", "123-45-67");
        readers[1] = new Reader("������ �. �.", 54321, "����������", "15.05.1985", "987-65-43");
        readers[2] = new Reader("������� �. �.", 13579, "�����������", "20.12.2000", "111-22-33");

        readers[0].takeBook(3);
        readers[1].takeBook("�����������", "�������", "������������");
        readers[2].takeBook(new Book("�����������", "�����1"), new Book("�������", "�����2"), new Book("������������", "�����3"));

        readers[0].returnBook(2);
        readers[1].returnBook("�����������", "�������");
        readers[2].returnBook(new Book("�����������", "�����1"), new Book("�������", "�����2"));
    }
}