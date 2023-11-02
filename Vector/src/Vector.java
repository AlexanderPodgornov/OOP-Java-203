/** <b>Реализация класса вектор</b>
 *
 *
 * @author Podgornov Alexander
 * @version 1.0
 * @since  20.09.2023
 */
public class Vector {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Vector() {
    }


    public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Сумма векторов
     * @param v1 первый вектор
     * @param v2 второй вектор
     * @return вектор, который является суммой векторов v1 и v2
     */

    public static Vector sumVectors(Vector v1, Vector v2) {
        return new Vector(v1.getX1() + v2.getX1(), v1.getY1() + v2.getY1(),
                v1.getX2() + v2.getX2(), v1.getY2() + v2.getY2());
    }


    /**
     * Разность векторов
     * @param v1 первый вектор
     * @param v2 второй вектор
     * @return вектор, который является разностью векторов v1 и v2
     */

    public static Vector subVectors(Vector v1, Vector v2) {
        return new Vector(v1.getX1() - v2.getX1(), v1.getY1() - v2.getY1(),
                v1.getX2() - v2.getX2(), v1.getY2() - v2.getY2());
    }


    /**
     * Скалярное произведение
     * @param v1 первый вектор
     * @param v2 второй вектор
     * @return скалярное произведение векторов
     */
    public static double scalarMul(Vector v1, Vector v2) {
        return v1.getX1() * v2.getX2() + v1.getY1() * v2.getY2();
    }


    /**
     * Умножает вектор на число
     * @param v вектор
     * @param k число,на которое нужно умножить вектор
     * @return вектор, умноженный на данное число
     */

    public static Vector multiplicationByK(Vector v, double k) {
        return new Vector(v.x1 * k, v.y1 * k, v.x2 * k, v.y2 * k);
    }


    /**
     * @return длину вектора
     */
    public double length() {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }


    /**
     * @return y координату начальной точки вектора
     */
    public double getY1() {
        return y1;
    }


    /**
     * Изменяет y координату начальной точки вектора
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }


    /**
     * @return x координату начальной точки вектора
     */
    public double getX1() {
        return x1;
    }


    /**
     * Изменяет x координату начальной точки вектора
     */

    public void setX1(double x1) {
        this.x1 = x1;
    }


    /**
     * @return x координату конечной точки вектора
     */
    public double getX2() {
        return x2;
    }


    /**
     * Изменяет x координату конечной точки вектора
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }


    /**
     * @return y координату конечной точки вектора
     */
    public double getY2() {
        return y2;
    }

    /**
     * Изменяет y координату конечной точки вектора
     */
    public void setY2(double y2) {
        this.y2 = y2;
    }

    public static void print(Vector vector) {
        System.out.println("(" + (vector.getX2() - vector.getX1()) + "," + (vector.getY2() - vector.getY1()) + ")");
    }
}