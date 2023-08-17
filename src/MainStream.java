import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainStream {
    // Задача №1 ДЗ 2
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        // Для получения потока из массива целых чисел используйте:
        // Stream<Integer> stream;
        intList.stream()

                //К потоку примените ряд промежуточных операций:
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                //Потребуется и терминальная операция. Например:
                .forEach(System.out::println);


    }
}
