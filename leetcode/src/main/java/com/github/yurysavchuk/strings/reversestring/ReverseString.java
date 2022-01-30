package com.github.yurysavchuk.strings.reversestring;

public class ReverseString {

    public void reverseString(char[] s) {
        int arrayLength = s.length;
        for (int i = 0; i < arrayLength/2; i++ ) {
            int indexToSwap = arrayLength - i - 1;
            extracted(s, i, indexToSwap);
        }
    }

    private void extracted(char[] s, int i, int indexToSwap) {
        char temp = s[i];
        s[i] = s[indexToSwap];
        s[indexToSwap] = temp;
    }
}
