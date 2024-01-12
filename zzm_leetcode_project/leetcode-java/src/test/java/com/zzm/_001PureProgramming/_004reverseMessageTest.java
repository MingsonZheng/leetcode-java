package com.zzm._001PureProgramming;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _004reverseMessageTest {

    @Test
    public void test1() {
        String message = "the sky is blue";
        String s = new _004reverseMessage().reverseMessage(message);
        System.out.println(s);
    }
    @Test
    public void test2() {
        String message = "  hello world!  ";
        String s = new _004reverseMessage().reverseMessage(message);
        System.out.println(s);
    }

    @Test
    public void test3() {
        String message = "a good   example";
        String s = new _004reverseMessage().reverseMessage(message);
        System.out.println(s);
    }
}
