package com.github.yurysavchuk.arrays.removeduplfromsortarr;


public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicatesFromSortedArray(int[] array) {
        int resultIndex = 0;
        for (int i = 0; i < array.length; i++) {
           if (array[i] != array[resultIndex]) {
               resultIndex++;
               array[resultIndex] = array[i];
           }
        }
        return resultIndex + 1;
    }
}
