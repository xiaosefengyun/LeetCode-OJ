import java.util.*;

/**
 * Created by vince on 16/11/2016.
 */
public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> strings = new ArrayList<String>();

        for (int i = 1, length = n; i <= n; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                strings.add("FizzBuzz");
            } else if (i % 3 == 0) {
                strings.add("Fizz");
            } else if ((i % 5 == 0)) {
                strings.add("Buzz");
            } else {
                strings.add(Integer.toString(i));
            }
        }

        return strings;
    }
}
