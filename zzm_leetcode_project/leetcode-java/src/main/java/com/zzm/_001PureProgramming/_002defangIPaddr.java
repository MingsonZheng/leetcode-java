package com.zzm._001PureProgramming;

/**
 * @author Mingson
 * @version 1.0
 */
public class _002defangIPaddr {
    public String defangIPaddr(String address) {
        char[] orignal = address.toCharArray();
        int n = orignal.length;
        int newN = n + 3 * 2;
        char[] newString = new char[newN];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (orignal[i] != '.') {
                newString[k] = orignal[i];
                k++;
            } else {
                newString[k++] = '[';
                newString[k++] = '.';
                newString[k++] = ']';
            }
        }
        return new String(newString);
    }

    public String defangIPaddr2(String address) {
        int n = address.length();
        StringBuilder sb = new StringBuilder(n + 2*3);
        for (int i = 0; i < n; i ++) {
            char c = address.charAt(i);
            if (c != '.') {
                sb.append(c);
            } else {
                sb.append("[.]");
            }
        }
        return sb.toString();
    }

    public String defangIPaddr1(String address) {
        return address.replace(".", "[.]");
    }
}
