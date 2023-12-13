package task8;

public class Calculator {
    public static <T,V> double sum(T a, V b) {
        double num1 = convertToDouble(a);
        double num2 = convertToDouble(b);
        return num1 + num2;
    }

    public static <T,V>double mul(T a, V b) {
        double num1 = convertToDouble(a);
        double num2 = convertToDouble(b);
        return num1 * num2;
    }

    public static <T,V>double div(T a, V b) {
        double num1 = convertToDouble(a);
        double num2 = convertToDouble(b);
        if (num2 == 0) {
            throw new ArithmeticException("Деление на ноль!");
        }
        return num1 / num2;
    }

    public static <T,V>double sub(T a, V b) {
        double num1 = convertToDouble(a);
        double num2 = convertToDouble(b);
        return num1 - num2;
    }

    private static double convertToDouble(Object value) {
        if (value instanceof Number) {
            return ((Number) value).doubleValue();
        } else if (value instanceof String) {
            try {
                return Double.parseDouble((String) value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Некорректный ввод " + value);
            }
        } else {
            throw new IllegalArgumentException("Посторонний класс " + value.getClass());
        }
    }
}