import java.util.Scanner;
import java.util.Stack;

/**
 * Created by vince on 15/11/2016.
 */
public class ReverseString {
     public static String reverseString(String s) {
         StringBuilder stringBuilder = new StringBuilder("");
        for (int i = s.length() - 1, length = s.length(); i >= 0; i--) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
     }
}
