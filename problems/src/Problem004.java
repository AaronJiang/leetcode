import java.util.ArrayList;

/**
 * Created by long on 2017/11/26.
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 */
public class Problem004 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> numsAll = new ArrayList<Integer>();
        int index1 = 0;
        int index2 = 0;

        while (index1 + index2 < nums1.length + nums2.length) {
            //每次取两个数组中较小的数
            if (index2 == nums2.length) {
                numsAll.add(nums1[index1]);
                index1++;
                continue;
            }

            if (index1 == nums1.length) {
                numsAll.add(nums2[index2]);
                index2++;
                continue;
            }

            if ((index1 < nums1.length && index2 < nums2.length && nums1[index1] <= nums2[index2])) {
                numsAll.add(nums1[index1]);
                index1++;
                continue;
            }

            if ((index1 < nums1.length && index2 < nums2.length && nums1[index1] > nums2[index2])) {
                numsAll.add(nums2[index2]);
                index2++;
                continue;
            }

        }

        double median = 0;
        if (numsAll.size() % 2 == 0) {
            median = (numsAll.get(numsAll.size() / 2 - 1) + numsAll.get(numsAll.size() / 2)) /2f;
        } else {
            median = numsAll.get((numsAll.size() - 1) / 2);
        }

        return median;
    }
}
