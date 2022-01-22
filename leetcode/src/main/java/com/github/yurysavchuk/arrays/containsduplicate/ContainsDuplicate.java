package com.github.yurysavchuk.arrays.containsduplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numSet.contains(nums[i])) {
                return true;
            }
            numSet.add(nums[i]);
        }
        return false;
    }
}
