package com.zzm._002FindRules;

/**
 * @author Mingson
 * @version 1.0
 */
public class _004oneEditAway {
    public boolean oneEditAway(String first, String second) {
        int n = first.length();
        int m = second.length();
        // 如果长度相差大于1，不可能一次编辑
        if (Math.abs(n-m) > 1) return false;
        // 如果长度相等，不同的字符个数小于等于1，替换或零次
        int diffCount = 0;
        if (n == m) {
            for (int i = 0; i < n; i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    diffCount++;
                }
            }
            return diffCount <= 1;
        }
        // 如果长度相差等于1，插入或删除
        diffCount = 0;
//        if (Math.abs(n-m) == 1) {
            int i = 0;
            int j = 0;
            while (i < n && j < m) {
                if (first.charAt(i) != second.charAt(j)) {
                    diffCount++;
                    if (n > m) {
                        i++;
                    } else {
                        j++;
                    }
                } else {
                    i++;
                    j++;
                }
            }
//        }
        return diffCount <= 1;
    }
}
