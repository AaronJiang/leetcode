import java.util.HashSet;

/**
 * Created by long on 2017/11/19.
 * <p>
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Problem003 {
    public static void main(String[] args) {
        String str = "pwwkew";
        int count = Problem003.lengthOfLongestSubstring(str);
        System.out.println(count);
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        int countMax = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<String> countSet = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                String currentStr = s.substring(j, j + 1);
                if (countSet.contains(currentStr)) {
                    break;
                }
                countSet.add(currentStr);
            }
            countMax = countMax > countSet.size() ? countMax : countSet.size();

        }

        return countMax;
    }
}