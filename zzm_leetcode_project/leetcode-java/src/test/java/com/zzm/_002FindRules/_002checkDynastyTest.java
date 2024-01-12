package com.zzm._002FindRules;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _002checkDynastyTest {

    /*
    输入: places = [0, 6, 9, 0, 7]
    输出: True
    输入: places = [7, 8, 9, 10, 11]
    输出: True
     */
    @Test
    public void test1() {
        int[] places = new int[]{0, 6, 9, 0, 7};
        boolean b = new _002checkDynasty().checkDynasty(places);
        assert b == true;
    }

    @Test
    public void test2() {
        int[] places = new int[]{7, 8, 9, 10, 11};
        boolean b = new _002checkDynasty().checkDynasty(places);
        assert b == true;
    }

    @Test
    public void test3() {
        int[] places = new int[]{0,0,2,2,5};
        boolean b = new _002checkDynasty().checkDynasty(places);
        assert b == false;
    }
}
