package com.zzm._001PureProgramming;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _006isPalindromeTest {

    @Test
    public void test1() {
        int x = 121;
        boolean b = new _006isPalindrome().isPalindrome(x);
        System.out.println(b);
    }

    @Test
    public void test2() {
        int x = -121;
        boolean b = new _006isPalindrome().isPalindrome(x);
        System.out.println(b);
    }

    @Test
    public void test3() {
        int x = 10;
        boolean b = new _006isPalindrome().isPalindrome(x);
        System.out.println(b);
    }

    @Test
    public void test4() {
        int x = 0;
        boolean b = new _006isPalindrome().isPalindrome(x);
        System.out.println(b);
    }
}
