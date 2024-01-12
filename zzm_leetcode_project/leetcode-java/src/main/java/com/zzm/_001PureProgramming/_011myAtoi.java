package com.zzm._001PureProgramming;

/**
 * @author Mingson
 * @version 1.0
 */
public class _011myAtoi {
    public int myAtoi(String str) {
        // s = "   -42"
        int n = str.length();
        if (n == 0) return 0;

        // 处理前置空格
        int i = 0;
        char[] chars = str.toCharArray();
        while (i < n && chars[i] == ' ') {
            i++;
        }
        if (i == n) return 0;

        // 处理符号位
        int flag = 1;
        if (chars[i] == '+') {
            i++;
        } else if (chars[i] == '-') {
            flag = -1;
            i++;
        }

        // 处理数字
        // -2147483648 ~ 2147483647
        int result = 0;
        int intAbsHigh = 214748364;
        while(i < n && chars[i] >= '0' && chars[i] <= '9') {
            // 判断再乘以10加d是否大于intAbsHigh
            if (result > intAbsHigh) {
                if (flag == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }
            // 注意需要转换
            int d = chars[i] - '0';
            if (result == intAbsHigh) {
                if (flag == 1 && d > 7) return Integer.MAX_VALUE;
                if (flag == -1 && d >= 8) return Integer.MIN_VALUE;
            }
            // 正常逻辑
            result = result * 10 + d;
            i++;
        }
        return result * flag;
    }
}
