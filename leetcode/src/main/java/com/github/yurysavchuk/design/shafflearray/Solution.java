package com.github.yurysavchuk.design.shafflearray;

import java.util.Random;

public class Solution {
    private int[] array;
    private int[] original;

    Random rand = new Random();

    public Solution(int[] nums) {
        this.array = nums;
        this.original = nums.clone();
    }

    public int[] reset() {
        array = original;
        original = original.clone();
        return original;
    }

    public int[] shuffle() {
        for (int i = 0; i < array.length; i++) {
            swapAt(i, randRange(i, array.length));
        }
        return array;
    }

    private int randRange(int min, int max) {
        return rand.nextInt(max - min) + min;
    }

    private void swapAt(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
