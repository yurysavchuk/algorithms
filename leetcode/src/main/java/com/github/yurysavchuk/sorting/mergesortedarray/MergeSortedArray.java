package com.github.yurysavchuk.sorting.mergesortedarray;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int compareIndex = m - 1;
        int reviewIndex = n-1;
        int insertIndex = nums1.length - 1;

        while (reviewIndex >= 0) {
            if (compareIndex >= 0 && nums1[compareIndex] > nums2[reviewIndex]) {
                nums1[insertIndex--] = nums1[compareIndex--];
            } else {
                nums1[insertIndex--] = nums2[reviewIndex--];
            }
        }
    }

}
