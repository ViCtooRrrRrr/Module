package Task_3;
import java.util.HashSet;
import java.util.Set;
public class VariousElements {
    public static void main(String[] args) {
        int[] array = { 12, 10, 5,5};
        System.out.println("Количество элементов");
        System.out.println(array.length);
        Set<Integer> mySet = new HashSet<>();
        for (int x : array) {
            mySet.add(x);
        }
        System.out.println("Количество различных элементов");
        System.out.println(mySet.size());
    }
}
