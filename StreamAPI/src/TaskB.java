import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskB {
    public void getEvenNumbersPro(List<Integer> list){
        List<Integer> EvenNumbers = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(EvenNumbers);
    }
    public void NamesPro(List<String> list, Character l){
        char letter = Character.toUpperCase(l);
        List<String> upper = list.stream().map(str -> str.substring(0, 1).toUpperCase() + str.substring(1)).toList();
        long count = list.stream().map(str -> str.substring(0, 1).toUpperCase() + str.substring(1)).filter(str -> str.charAt(0) == letter).count();
        System.out.println(upper);
        System.out.println(count);
    }
}
