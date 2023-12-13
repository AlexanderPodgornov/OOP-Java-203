package task8;

import static task8.Calculator.*;

public class Main {

    public static void main(String[] args) {
        int num1 = 3;
        String num2 = "2.718281828459045";
        System.out.println("Sum: " + sum(num1, num2));
        System.out.println("Mul: " + mul(num1, num2));
        System.out.println("Div: " + div(num1, num2));
        System.out.println("Sub: " + sub(num1, num2));
    }
}
