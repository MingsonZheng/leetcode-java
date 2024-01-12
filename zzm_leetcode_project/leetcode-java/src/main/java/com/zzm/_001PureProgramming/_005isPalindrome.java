package com.zzm._001PureProgramming;

/**
 * @author Mingson
 * @version 1.0
 */
public class _005isPalindrome {
    public boolean isPalindrome(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        // 移除所有非字母数字字符
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (!isAlpha(str[i])) {
                i++;
                continue;
            }
            if (!isAlpha(str[j])) {
                j--;
                continue;
            }
            // 将所有大写字符转换为小写字符
            // 正着读和反着读都一样
            if (toLower(str[i]) == toLower(str[j])) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    private char toLower(char c) {
        if (c >= 'A' && c <= 'Z') {
            // to be tested
            c += 32;
        }
        return c;
    }

    private boolean isAlpha(char c) {
        if (c >= 'a' && c <= 'z') return true;
        if (c >= 'A' && c <= 'Z') return true;
        if (c >= '0' && c <= '9') return true;
        return false;
    }
}
