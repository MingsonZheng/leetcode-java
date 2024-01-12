package com.zzm._002FindRules;

/**
 * @author Mingson
 * @version 1.0
 */
public class _002checkDynasty {
    public boolean checkDynasty(int[] places) {
        /*
        输入: places = [0, 6, 9, 0, 7]
        输出: True
        输入: places = [7, 8, 9, 10, 11]
        输出: True
         */
        // 判断最大最小值的差值是否小于5
        int min = 100;
        int max = -1;
        // 判断是否重复
//        boolean[] dup = new boolean[5];
        boolean[] dup = new boolean[14];// 来自 13 个朝代的文物
        for (int i = 0; i < 5; i++) {
            if (places[i] != 0) {
//                if (dup[i]) return false;
//                else dup[i] = true;
                if (dup[places[i]]) return false;
                else dup[places[i]] = true;
                if (places[i] < min) min = places[i];
                if (places[i] > max) max = places[i];
            }
        }
        return max - min < 5;
    }
}
