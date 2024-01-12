package com.zzm._001PureProgramming;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _008pathEncryptionTest {

    @Test
    public void test1() {
        String path = "a.aef.qerf.bb";
        String s = new _008pathEncryption().pathEncryption(path);
        System.out.println(s);
    }
}
