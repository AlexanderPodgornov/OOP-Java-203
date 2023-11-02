public class Main {
    public static void main(String[] args) {
        Vector vector1 = new Vector(10,10,5,6);
        Vector vector2 = new Vector(2,8,1,6);
        System.out.println(Vector.scalarMul(vector1, vector2));
        Vector.print(vector1);
        Vector.print(Vector.sumVectors(vector1, vector2));
        Vector.print(Vector.subVectors(vector1, vector2));
        Vector.print(Vector.multiplicationByK(vector1, 10));
    }
}