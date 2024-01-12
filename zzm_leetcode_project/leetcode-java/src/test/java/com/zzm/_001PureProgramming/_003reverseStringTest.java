package com.zzm._001PureProgramming;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Mingson
 * @version 1.0
 */
public class _003reverseStringTest {

    @Test
    public void test1() {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        new _003reverseString().reverseString(str);
        System.out.println(Arrays.toString(str));
    }

    @Test
    public void test2() {
        char[] str = {'H','a','n','n','a','h'};
        new _003reverseString().reverseString(str);
        System.out.println(Arrays.toString(str));
    }
}
