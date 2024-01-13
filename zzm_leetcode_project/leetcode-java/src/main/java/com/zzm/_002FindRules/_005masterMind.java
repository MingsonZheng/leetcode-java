package com.zzm._002FindRules;

/**
 * @author Mingson
 * @version 1.0
 */
public class _005masterMind {
    public int[] masterMind(String solution, String guess) {
        /*
        输入： solution="RGBY",guess="GGRR"
        输出： [1,1]
        解释： 猜中1次，伪猜中1次。
         */
        int n = solution.length();
        boolean[] hited = new boolean[n];// guess 中已经猜中的字符
        boolean[] used = new boolean[n];// solution 中已经被用的字符
        // 先判断猜中
        int hitCount = 0;
        for (int i = 0; i < n; i++) {
            if (solution.charAt(i) == guess.charAt(i)) {
                hited[i] = true;
                used[i] = true;
                hitCount++;
            }
        }
        // 再判断伪猜中
        int fakeHitCount = 0;
        for (int i = 0; i < n; i++) {
            if (hited[i]) continue;
            for (int j = 0; j < n; j++) {
                if (guess.charAt(i) == solution.charAt(j) && !used[j]) {
                    used[j] = true;
                    fakeHitCount++;
                    break;
                }
            }
        }
        return new int[]{hitCount, fakeHitCount};
    }
}
