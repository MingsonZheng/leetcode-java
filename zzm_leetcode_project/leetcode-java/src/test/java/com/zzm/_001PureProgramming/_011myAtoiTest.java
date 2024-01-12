package com.zzm._001PureProgramming;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _011myAtoiTest {

    @Test
    public void test1() {
        String str = "42";
        int num = new _011myAtoi().myAtoi(str);
        int expectedNum = 42;
        assert num == expectedNum;
    }

    @Test
    public void test2() {
        String str = "   -42";
        int num = new _011myAtoi().myAtoi(str);
        int expectedNum = -42;
        assert num == expectedNum;
    }

    @Test
    public void test3() {
        String str = "4193 with words";
        int num = new _011myAtoi().myAtoi(str);
        int expectedNum = 4193;
        assert num == expectedNum;
    }

    @Test
    public void test4() {
        String str = "-21474836482";
        int num = new _011myAtoi().myAtoi(str);
        int expectedNum = -2147483648;
        assert num == expectedNum;
    }
}
