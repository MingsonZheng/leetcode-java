package com.zzm._001PureProgramming;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _005isPalindromeTest {

    @Test
    public void test1() {
        String s = "A man, a plan, a canal: Panama";
        boolean b = new _005isPalindrome().isPalindrome(s);
        System.out.println(b);
    }

    @Test
    public void test2() {
        String s = "race a car";
        boolean b = new _005isPalindrome().isPalindrome(s);
        System.out.println(b);
    }

    @Test
    public void test3() {
        String s = " ";
        boolean b = new _005isPalindrome().isPalindrome(s);
        System.out.println(b);
    }
}
