package com.zzm._001PureProgramming;

/**
 * @author Mingson
 * @version 1.0
 */
public class _008pathEncryption {
    public String pathEncryption(String path) {
        int n = path.length();
        // 特殊情况处理
        if (n == 0) return "";

        char[] str = path.toCharArray();
        for (int i = 0; i < n; i++) {
            if (str[i] == '.') {
                str[i] = ' ';
            }
        }
        return new String(str);
    }
}
