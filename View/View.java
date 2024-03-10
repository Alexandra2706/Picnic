package View;

import java.util.List;
import java.util.Map;

public class View<T> {

    public View() {

    }

    public void printList(List<T> array, String msg) {
        System.out.println(msg);
        for (T item : array) {
            System.out.println("\t" + item);
        }
    }

    public void printMap(Map<T, Integer> map, String msg) {
        System.out.println(msg);
        for (Map.Entry<T, Integer> item : map.entrySet()) {
            System.out.println("\t" + item);
        }
    }

}
