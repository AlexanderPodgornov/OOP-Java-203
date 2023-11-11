import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class TaskA {
    public void number1(){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            list.add(random.nextInt() % 100 + 100);
        }
        list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
    public void number2(){
        String[] array = {"James", "Jack", "Robert", "Mike", "Bob", "Java"};
        Arrays.stream(array).filter(x -> x.charAt(0) == 'J').forEach(System.out::println);
    }
    public void number3(){
        String[] array = {"James", "Jack", "Robert", "Mike", "Bob", "Java"};
        Arrays.stream(array).sorted().forEach(System.out::println);
    }
}
