/**
 * Created by vince on 16/11/2016.
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {

        //核心思想是两个相同的数相^等于0

        int result = 0;
        for (int i = 0, length = nums.length; i < length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
