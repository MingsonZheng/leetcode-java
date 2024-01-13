package com.zzm._002FindRules;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _004oneEditAwayTest {

    @Test
    public void test1() {
        String first = "horse";
        String second = "ros";
        boolean b = new _004oneEditAway().oneEditAway(first, second);
        assert !b;
    }

    @Test
    public void test2() {
        String first = "pale";
        String second = "ple";
        boolean b = new _004oneEditAway().oneEditAway(first, second);
        assert b;
    }
}
