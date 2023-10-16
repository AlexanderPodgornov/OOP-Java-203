import java.io.IOException;

/**
 * <b>Сложение двух чисел</b>
 *
 * Класс Number реализует приложение, которое складывает 2 числа и выводит их сумму на экран
 *
 * <b>Примечание: </b> здесь может быть ваше примечание
 *
 * @author Alexander Podgornov
 * @version 1.0
 * @since 07.10.2023
 */

public class Number {
    /**
     *
     * @param Fnum first number
     * @param Snum second number
     * @return summ of first and second numbers
     */
    public int sum(int Fnum, int Snum){
        return Fnum + Snum;
    }

    public static void main(String[] args) throws IOException {
        Number number = new Number();
        int sum = number.sum(10, 20);
        System.out.println("Sum is equal to " + sum);
    }
}