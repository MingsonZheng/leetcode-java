package com.zzm._002FindRules;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _003divingBoardTest {

    @Test
    public void test1() {
        int shorter = 1;
        int longer = 2;
        int k = 3;
        int[] result = new _003divingBoard().divingBoard(shorter, longer, k);
        int[] expectedResult = {3, 4, 5, 6};
        for (int i = 0; i < expectedResult.length; i++) {
            assert expectedResult[i] == result[i];
        }
    }
}
