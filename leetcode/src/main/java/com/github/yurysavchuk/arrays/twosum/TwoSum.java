package com.github.yurysavchuk.arrays.twosum;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[] {i, j};
                }
            }
        }
        return result;
    }
}
