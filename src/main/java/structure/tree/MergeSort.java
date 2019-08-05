package structure.tree;

import java.util.Arrays;

/**
 * @Description：归并排序
 * @Author wangliang
 * @Created 2019-08-05 19:29
 * @Version 1.0
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {4, 9, 6, 1, 5, 2, 0, 3, -1, 101, 20};
        System.out.println(Arrays.toString(nums));
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            int start1 = left;
            int start2 = mid + 1;

            int location = left;
            int[] newNums = new int[nums.length];
            while (start1 <= mid && start2 <= right) {
                if (nums[start1] <= nums[start2]) {
                    newNums[location++] = nums[start1++];
                } else {
                    newNums[location++] = nums[start2++];
                }
            }
            while (start1 <= mid) {
                newNums[location++] = nums[start1++];
            }
            while (start2 <= right) {
                newNums[location++] = nums[start2++];
            }
            for (int i = left; i <= right; i++) {
                nums[i] = newNums[i];
            }
        }
    }
}
