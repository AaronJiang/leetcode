import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by long on 2017/11/19.
 * <p>
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class Problem001 {
    public static void main(String[] args) {
        int[] arr = {3,3};
        int[] result = Problem001.twoSum(arr, 6);
        System.out.println(Arrays.toString(result));
    }

    /**
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int subtractor = target - nums[i];

            if (map.containsKey(target - nums[i]) && map.get(target-nums[i]) != i) {
                return new int[]{i, map.get(target-nums[i])};
            }
        }

        return new int[]{};
    }
}
