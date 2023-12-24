package homework.capleOfNumbers;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumbersForSum {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Set<Integer> values = new HashSet<>();
        int target = 5;

        Map<Integer, Integer> result = new HashMap<>();
        for (int i : array) {
            if (i < target) {
                int second = target - i;
                if (values.contains(second)) {
                    result.put(i, second);
                }
                values.add(i);
            }
        }
        System.out.println(result);
    }
}
