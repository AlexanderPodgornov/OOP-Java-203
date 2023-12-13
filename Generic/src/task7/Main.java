package task7;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        MinMax<Integer> intMinMax = new MinMax<>(intArray);
        System.out.println("Min: " + intMinMax.findMin());
        System.out.println("Max: " + intMinMax.findMax());

        String[] strArray = {"apple", "banana", "cherry", "saransk"};
        MinMax<String> strMinMax = new MinMax<>(strArray);
        System.out.println("Min: " + strMinMax.findMin());
        System.out.println("Max: " + strMinMax.findMax());
    }
}
