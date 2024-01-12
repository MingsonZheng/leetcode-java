package com.zzm._001PureProgramming;

/**
 * @author Mingson
 * @version 1.0
 */
public class _006isPalindrome {
    public boolean isPalindrome(int x) {
        // 特殊情况处理
        if (x < 0) return false;

        // 反转x进行比较
        int backupX = x;
        int y = 0;
        while (x != 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return y == backupX;
    }

    public boolean isPalindrome1(int x) {
        // 特殊情况处理
        if (x < 0) return false;

        // int 2112345678
        int[] digits = new int[10];
        // int -> int[]
        int k = 0;
        while (x != 0) {
            digits[k] = x % 10;
            x /= 10;
            k++;
        }
        int i = 0;
        int j = k - 1;
        while (i < k / 2) {
            if (digits[i] == digits[j]) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
