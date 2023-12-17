//import java.util.Arrays;
//
//public class Calculate{
//
//    double sum(double... numbers){
//        double summa = 0;
//        for (double a: numbers){
//            if (!Double.isFinite(a))
//                throw new IllegalArgumentException("Неверный аргумент!");
//            summa += a;
//        }
//        return summa;
//    }
//    double sub(double... numbers){
//        double subtraction = numbers[0];
//        for (double a: numbers){
//            if (!Double.isFinite(a)) {
//                throw new IllegalArgumentException("Неверный аргумент!");
//        }
//            subtraction -= a;
//        }
//        subtraction+=numbers[0];
//        return subtraction;
//    }
//    double mul(double... numbers){
//        double multiplication = 1;
//        for (double a: numbers){
//            if (!Double.isFinite(a))
//                throw new IllegalArgumentException("Неверный аргумент!");
//            multiplication *= a;
//        }
//        return multiplication;
//    }
//    double div(double... numbers) throws RuntimeException{
//        double division = numbers[0];
//        for (int i = 1; i < numbers.length; i++){
//            if (!Double.isFinite(numbers[i]))
//                throw new IllegalArgumentException("Неверный аргумент!");
//            if (numbers[i] == 0) throw new ArithmeticException("Деление на ноль!");
//            division /= numbers[i];
//        }
//        return division;
//    }
//}
import java.util.List;


public class Calculate {
    public static double calculates(String eq) {
        String[] parts = eq.split("=");
        String leftExpression = parts[0].trim();
        String rightExpression = parts[1].trim();
        char variable = findVariable(leftExpression);
        if (variable == ' ') {
            variable = findVariable(rightExpression);
            List<Symbol> lexemes = SymbolBuffer.symAnalyze(leftExpression);
            SymbolBuffer lexemeBuffer = new SymbolBuffer(lexemes);
            double c = SymbolBuffer.expr(lexemeBuffer);
            if (rightExpression.length() == 2)
                c *= -1;
            return c;
        } else {
            boolean minus = false;
            String[] Rexp = rightExpression.split(" ");
            String[] exp = leftExpression.split(" ");
            for (int i = 0; i < exp.length; i++) {
                if (exp[i].matches("-[a-zA-Zа-яА-Я]")) {
                    minus = true;
                    exp[i] = exp[i].substring(1);
                }
            }
            switch (exp[1]) {
                case "*":
                    if (exp[0].equals("0") || exp[2].equals("0") && rightExpression.equals("0"))
                        System.out.println(variable + " = R");
                    else {
                        rightExpression += "/";
                        rightExpression += (variable == exp[0].charAt(0)) ? exp[2] : exp[0];
                        List<Symbol> lexemes = SymbolBuffer.symAnalyze(rightExpression);
                        SymbolBuffer lexemeBuffer = new SymbolBuffer(lexemes);
                        double c = SymbolBuffer.expr(lexemeBuffer);
                        if (minus) c *= -1;
                        return c;
                    }
                case "+":
                    rightExpression += "-";
                    rightExpression += (variable == exp[0].charAt(0)) ? exp[2] : exp[0];
                    List<Symbol> lexemes = SymbolBuffer.symAnalyze(rightExpression);
                    SymbolBuffer lexemeBuffer = new SymbolBuffer(lexemes);
                    double c = SymbolBuffer.expr(lexemeBuffer);
                    if (minus) c *= -1;
                    return c;
                case "-":
                    if (variable == exp[2].charAt(0)) {
                        exp[2] = Rexp[0];
                        String ex = exp[0] + exp[1] + exp[2];
                        List<Symbol> lexemes1 = SymbolBuffer.symAnalyze(ex);
                        SymbolBuffer lexemeBuffer1 = new SymbolBuffer(lexemes1);
                        double c1 = SymbolBuffer.expr(lexemeBuffer1);
                        if (minus) c1 *= -1;
                        return c1;
                    } else {
                        rightExpression += "+";
                        rightExpression += exp[2];
                        List<Symbol> lexemes1 = SymbolBuffer.symAnalyze(rightExpression);
                        SymbolBuffer lexemeBuffer1 = new SymbolBuffer(lexemes1);
                        double c1 = SymbolBuffer.expr(lexemeBuffer1);
                        if (minus) c1 *= -1;
                        return c1;
                    }
                case "/":
                    if (variable == exp[2].charAt(0)) {
                        exp[2] = Rexp[0];
                        String ex = exp[0] + exp[1] + exp[2];
                        List<Symbol> lexemes1 = SymbolBuffer.symAnalyze(ex);
                        SymbolBuffer lexemeBuffer1 = new SymbolBuffer(lexemes1);
                        double c1 = SymbolBuffer.expr(lexemeBuffer1);
                        if (minus) c1 *= -1;
                        return c1;
                    } else {
                        rightExpression += "*";
                        rightExpression += exp[2];
                        List<Symbol> lexemes1 = SymbolBuffer.symAnalyze(rightExpression);
                        SymbolBuffer lexemeBuffer1 = new SymbolBuffer(lexemes1);
                        double c1 = SymbolBuffer.expr(lexemeBuffer1);
                        if (minus) c1 *= -1;
                        return c1;
                    }
                default:
                    break;
            }
        }
        return 0;
    }


    public static char findVariable(String expression) {
        for (char c : expression.toCharArray()) {
            if (Character.isLetter(c))
                return c;
        }
        return ' ';
    }
}