package com.zzm._001PureProgramming;

/**
 * @author Mingson
 * @version 1.0
 */
public class _007lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // 从后往前检索
        int n = s.length();
        int i = n - 1;
        // 去除后置空格
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        // 特殊情况处理
        if (i < 0) return 0;
        // 统计字符串长度
        int len = 0;
        while (i >= 0 && s.charAt(i) != ' ') {
            len++;
            i--;
        }
        return len;
    }
}
