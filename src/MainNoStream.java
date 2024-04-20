import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainNoStream {
    // Задача №1 ДЗ 2 (поправил 20.04.2024)
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> listCopy = new ArrayList<>(list);
        for (int i = listCopy.size() - 1; i >= 0; i--) {
            if (list.get(i) <= 0 || list.get(i) % 2 != 0) {
                listCopy.remove(i);
            }
        }
        list = listCopy;
        Collections.sort(list);
        System.out.println(list);
    }
}


