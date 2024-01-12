package com.zzm._001PureProgramming;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _009dynamicPasswordTest {

    @Test
    public void test1() {
        String password = "s3cur1tyC0d3";
        int target = 4;
        String s = new _009dynamicPassword().dynamicPassword(password, target);
        System.out.println(s);
    }

    @Test
    public void test2() {
        String password = "vbzkgsaoiu";
        int target = 2;
        String s = new _009dynamicPassword().dynamicPassword(password, target);
        System.out.println(s);
    }
}
