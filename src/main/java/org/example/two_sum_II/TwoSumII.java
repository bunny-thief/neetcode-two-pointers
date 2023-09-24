package org.example.two_sum_II;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {
        int[] nums1 = {2,7,11,15};
        int[] actual = twoSum(nums1, 9);
        System.out.println(Arrays.toString(actual));
        int[] expected1 = new int[] {0, 1};
        System.out.println(Arrays.compare(actual, expected1));
    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        int num_i, num_j;

        while (i < j) {
            num_i = nums[i];
            num_j = nums[j];

            if (num_i + num_j == target) {
                break;
            }

            if (num_i + num_j < target) {
                i++;
                continue;
            }

            j--;
        }

        return new int[] {i + 1, j + 1};
    }

}
