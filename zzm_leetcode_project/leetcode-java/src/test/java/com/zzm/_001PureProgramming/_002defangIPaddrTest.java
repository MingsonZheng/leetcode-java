package com.zzm._001PureProgramming;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _002defangIPaddrTest {

    @Test
    public void test1() {
        String address = "1.1.1.1";
        String s = new _002defangIPaddr().defangIPaddr(address);
        System.out.println(s);
    }

    @Test
    public void test2() {
        String address = "255.100.50.0";
        String s = new _002defangIPaddr().defangIPaddr(address);
        System.out.println(s);
    }
}
