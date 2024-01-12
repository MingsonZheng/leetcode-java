package com.zzm._001PureProgramming;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _010removeDuplicatesTest {

    @Test
    public void test1() {
        int[] nums = new int[]{1,1,2};
        int[] expectedNums = new int[]{1,2};
        int k = new _010removeDuplicates().removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    public void test2() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] expectedNums = new int[]{0,1,2,3,4};
        int k = new _010removeDuplicates().removeDuplicates(nums);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
