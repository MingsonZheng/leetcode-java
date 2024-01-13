package com.zzm._002FindRules;

/**
 * @author Mingson
 * @version 1.0
 */
public class _003divingBoard {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) return new int[0];
        if (shorter == longer) return new int[]{shorter * k};
        int[] result = new int[k + 1];
        // 0~k 块 longer
        for (int i = 0; i <= k; i++) {
            result[i] = longer * i + shorter * (k-i);
        }
        return result;
    }
}
