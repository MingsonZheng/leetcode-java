package com.zzm._002FindRules;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _005masterMindTest {

    @Test
    public void test1() {
        String solution = "RGBY";
        String guess = "GGRR";
        int[] result = new _005masterMind().masterMind(solution, guess);
        int[] expectedResult = new int[]{1,1};
        for (int i = 0; i < result.length; i++) {
            assert result[i] == expectedResult[i];
        }
    }

    @Test
    public void test2() {
        String solution = "BRBB";
        String guess = "RBGY";
        int[] result = new _005masterMind().masterMind(solution, guess);
        int[] expectedResult = new int[]{0,2};
        for (int i = 0; i < result.length; i++) {
            assert result[i] == expectedResult[i];
        }
    }

    @Test
    public void test3() {
        String solution = "RRBB";
        String guess = "BBRR";
        int[] result = new _005masterMind().masterMind(solution, guess);
        int[] expectedResult = new int[]{0,4};
        for (int i = 0; i < result.length; i++) {
            assert result[i] == expectedResult[i];
        }
    }
}
