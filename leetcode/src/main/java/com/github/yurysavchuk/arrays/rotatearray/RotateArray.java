package com.github.yurysavchuk.arrays.rotatearray;

public class RotateArray {
    // it's implementation of the left roation
    // TODO implement the right rotation
    public void rotate(int[] nums, int d) {
        int n = nums.length;
        d = d % n;
        int gcd = gcd(d, n);

        for (int i = 0; i < gcd; i++) {
            int temp = nums[i];
            int j = i;
            while (true) {
                int k = j + d;
                if (k >= n) {
                    k = k - n;
                }
                if (k == i) {
                    break;
                }
                nums[j] = nums[k];
                j = k;
            }
            nums[j] = temp;
        }
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
