package com.zzm._001PureProgramming;

/**
 * @author Mingson
 * @version 1.0
 */
public class _004reverseMessage {
    public String reverseMessage(String message) {
        char[] c = message.toCharArray();
        // 去除首尾中间空格，返回长度
        int n = trim(c);
        // 特殊情况处理
        if (n == 0) return "";
        //"  hello   world  "
        //"hello worldorld  "
        // 数组反转
        reverse(c, 0, n - 1);
        //"hello world"
        //"dlrow olleh"
        int p = 0;
        while (p < n) {
            int r = p;
            while (r < n && c[r] != ' ') {
                r++;
            }
            reverse(c, p, r-1);
            p = r + 1;
        }

        // 满足要求输出
        char[] newChar = new char[n];
        for (int k = 0; k < n; k++) {
            newChar[k] = c[k];
        }

        return new String(newChar);
    }

    // 数组反转
    private void reverse(char[] c, int i, int j) {
        while (i <= j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
    }

    // 去除首尾中间空格，返回长度
    private int trim(char[] c) {
        int n = c.length;
        // 去除首空格
        int i = 0;
        while (i < n && c[i] == ' ') {
            i++;
        }
        // 去除尾空格
        int j = n-1;
        while (j >= 0 && c[j] == ' ') {
            j--;
        }
        // 去除中间空格，并把后面的元素往前搬运
        int k = 0;
        while (i <= j) {
            //"  hello   world  "
            //   i           j
            //        i      j
            //          i    j
            if (c[i] != ' ') {
                c[k++] = c[i];
            } else {
                // 小心数组越界
                if (i+1 <= j && c[i+1] != ' ') {
                    c[k++] = ' ';
                }
            }
            i++;
        }
        return k;
    }
}
