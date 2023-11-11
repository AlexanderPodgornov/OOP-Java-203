public class Main {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Иванов И. И.", 12345, "Физика", "01.01.1990", "123-45-67");
        readers[1] = new Reader("Петров П. П.", 54321, "Математика", "15.05.1985", "987-65-43");
        readers[2] = new Reader("Сидоров С. С.", 13579, "Информатика", "20.12.2000", "111-22-33");

        readers[0].takeBook(3);
        readers[1].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[2].takeBook(new Book("Приключения", "Автор1"), new Book("Словарь", "Автор2"), new Book("Энциклопедия", "Автор3"));

        readers[0].returnBook(2);
        readers[1].returnBook("Приключения", "Словарь");
        readers[2].returnBook(new Book("Приключения", "Автор1"), new Book("Словарь", "Автор2"));
    }
}