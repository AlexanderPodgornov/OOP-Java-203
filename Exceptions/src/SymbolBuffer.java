import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;


public class SymbolBuffer {

    private int pos;

    public List<Symbol> Symbols;

    public SymbolBuffer(List<Symbol> Symbols) {
        this.Symbols = Symbols;
    }

    public Symbol next() {
        return Symbols.get(pos++);
    }

    public void back() {
        pos--;
    }

    public int getPos() {
        return pos;
    }


    public static List<Symbol> symAnalyze(String expText) {
        ArrayList<Symbol> symbols = new ArrayList<>();
        int pos = 0;
        while (pos < expText.length()) {
            char c = expText.charAt(pos);
            switch (c) {
                case '(':
                    symbols.add(new Symbol(SymbolType.LEFT_BRACKET, c));
                    pos++;
                    continue;
                case ')':
                    symbols.add(new Symbol(SymbolType.RIGHT_BRACKET, c));
                    pos++;
                    continue;
                case '+':
                    symbols.add(new Symbol(SymbolType.OP_PLUS, c));
                    pos++;
                    continue;
                case '-':
                    symbols.add(new Symbol(SymbolType.OP_MINUS, c));
                    pos++;
                    continue;
                case '*':
                    symbols.add(new Symbol(SymbolType.OP_MUL, c));
                    pos++;
                    continue;
                case '/':
                    symbols.add(new Symbol(SymbolType.OP_DIV, c));
                    pos++;
                    continue;
                case '=':
                    symbols.add(new Symbol(SymbolType.EQUAL, String.valueOf(c)));
                    pos++;
                    continue;
                default:
                    if (c <= '9' && c >= '0') {
                        StringBuilder sb = new StringBuilder();
                        do {
                            sb.append(c);
                            pos++;
                            if (pos >= expText.length())
                                break;
                            c = expText.charAt(pos);
                        } while (c <= '9' && c >= '0');
                        symbols.add(new Symbol(SymbolType.NUMBER, sb.toString()));
                    } else if (String.valueOf(c).matches("[a-zA-Zà-ÿÀ-ß]")) {
                        c = 'x';
                        symbols.add(new Symbol(SymbolType.LETTER, String.valueOf(c)));
                        pos++;
                    } else {
                        if (c != ' ')
                            throw new RuntimeException("Unexpected character: " + c);
                        pos++;
                    }
            }
        }
        symbols.add(new Symbol(SymbolType.EOF, ""));
        return symbols;
    }

    public static double expr(SymbolBuffer Symbols) {
        Symbol Symbol = Symbols.next();
        if (Symbol.type == SymbolType.EOF)
            return 0;
        else {
            Symbols.back();
            return plusminus(Symbols);
        }
    }

    public static double plusminus(SymbolBuffer Symbols) {
        double value = multdiv(Symbols);
        while (true) {
            Symbol Symbol = Symbols.next();
            switch (Symbol.type) {
                case OP_PLUS:
                    value += multdiv(Symbols);
                    break;
                case OP_MINUS:
                    value -= multdiv(Symbols);
                    break;
                case EOF:
                case RIGHT_BRACKET:
                    Symbols.back();
                    return value;
                default:
                    throw new RuntimeException("Unexpected token: " + Symbol.value
                            + " at position: " + Symbols.getPos());
            }
        }
    }

    public static double multdiv(SymbolBuffer Symbols) {
        double value = factor(Symbols);
        while (true) {
            Symbol Symbol = Symbols.next();
            switch (Symbol.type) {
                case OP_MUL:
                    value *= factor(Symbols);
                    break;
                case OP_DIV:
                    value /= factor(Symbols);
                    break;
                case EOF:
                case RIGHT_BRACKET:
                case OP_PLUS:
                case OP_MINUS:
                    Symbols.back();
                    return value;
                default:
                    throw new RuntimeException("Unexpected token: " + Symbol.value
                            + " at position: " + Symbols.getPos());
            }
        }
    }

    public static double factor(SymbolBuffer Symbols) {
        Symbol Symbol = Symbols.next();
        switch (Symbol.type) {
            case OP_MINUS:
                double unValue = factor(Symbols);
                return -unValue;
            case NUMBER:
                return parseInt(Symbol.value);
            case LEFT_BRACKET:
                double value = plusminus(Symbols);
                Symbol = Symbols.next();
                if (Symbol.type != SymbolType.RIGHT_BRACKET)
                    throw new RuntimeException("Unexpected token: " + Symbol.value
                            + " at position: " + Symbols.getPos());

                return value;
            default:
                throw new RuntimeException("Unexpected token: " + Symbol.value
                        + " at position: " + Symbols.getPos());
        }
    }

}