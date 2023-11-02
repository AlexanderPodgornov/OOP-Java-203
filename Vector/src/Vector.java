/** <b>���������� ������ ������</b>
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
     * ����� ��������
     * @param v1 ������ ������
     * @param v2 ������ ������
     * @return ������, ������� �������� ������ �������� v1 � v2
     */

    public static Vector sumVectors(Vector v1, Vector v2) {
        return new Vector(v1.getX1() + v2.getX1(), v1.getY1() + v2.getY1(),
                v1.getX2() + v2.getX2(), v1.getY2() + v2.getY2());
    }


    /**
     * �������� ��������
     * @param v1 ������ ������
     * @param v2 ������ ������
     * @return ������, ������� �������� ��������� �������� v1 � v2
     */

    public static Vector subVectors(Vector v1, Vector v2) {
        return new Vector(v1.getX1() - v2.getX1(), v1.getY1() - v2.getY1(),
                v1.getX2() - v2.getX2(), v1.getY2() - v2.getY2());
    }


    /**
     * ��������� ������������
     * @param v1 ������ ������
     * @param v2 ������ ������
     * @return ��������� ������������ ��������
     */
    public static double scalarMul(Vector v1, Vector v2) {
        return v1.getX1() * v2.getX2() + v1.getY1() * v2.getY2();
    }


    /**
     * �������� ������ �� �����
     * @param v ������
     * @param k �����,�� ������� ����� �������� ������
     * @return ������, ���������� �� ������ �����
     */

    public static Vector multiplicationByK(Vector v, double k) {
        return new Vector(v.x1 * k, v.y1 * k, v.x2 * k, v.y2 * k);
    }


    /**
     * @return ����� �������
     */
    public double length() {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }


    /**
     * @return y ���������� ��������� ����� �������
     */
    public double getY1() {
        return y1;
    }


    /**
     * �������� y ���������� ��������� ����� �������
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }


    /**
     * @return x ���������� ��������� ����� �������
     */
    public double getX1() {
        return x1;
    }


    /**
     * �������� x ���������� ��������� ����� �������
     */

    public void setX1(double x1) {
        this.x1 = x1;
    }


    /**
     * @return x ���������� �������� ����� �������
     */
    public double getX2() {
        return x2;
    }


    /**
     * �������� x ���������� �������� ����� �������
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }


    /**
     * @return y ���������� �������� ����� �������
     */
    public double getY2() {
        return y2;
    }

    /**
     * �������� y ���������� �������� ����� �������
     */
    public void setY2(double y2) {
        this.y2 = y2;
    }

    public static void print(Vector vector) {
        System.out.println("(" + (vector.getX2() - vector.getX1()) + "," + (vector.getY2() - vector.getY1()) + ")");
    }
}