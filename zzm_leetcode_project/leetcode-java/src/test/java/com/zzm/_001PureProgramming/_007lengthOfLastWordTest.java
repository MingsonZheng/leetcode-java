package com.zzm._001PureProgramming;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _007lengthOfLastWordTest {

    @Test
    public void test1() {
        String s = "Hello World";
        int n = new _007lengthOfLastWord().lengthOfLastWord(s);
        System.out.println(n);
    }

    @Test
    public void test2() {
        String s = "   fly me   to   the moon  ";
        int n = new _007lengthOfLastWord().lengthOfLastWord(s);
        System.out.println(n);
    }

    @Test
    public void test3() {
        String s = "luffy is still joyboy";
        int n = new _007lengthOfLastWord().lengthOfLastWord(s);
        System.out.println(n);
    }
}
