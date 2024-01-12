package com.zzm._001PureProgramming;

/**
 * @author Mingson
 * @version 1.0
 */
public class _009dynamicPassword {
    public String dynamicPassword(String password, int target) {
        // abcde 3
        // deabc
        // 01234
        int n = password.length();
        char[] str = password.toCharArray();
        char[] newStr = new char[n];
        // 先把 [0, t) 搬运到 [n-t, n)
        for (int i = 0; i < target; i++) {
            newStr[n-target+i] = str[i];
        }
        // 再把 [t, n) 搬运到 [0, t)
        for (int i = target; i < n; i++) {
            newStr[i-target] = str[i];
        }
        return new String(newStr);
    }
}
