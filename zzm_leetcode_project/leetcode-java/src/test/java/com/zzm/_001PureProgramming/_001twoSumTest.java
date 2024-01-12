package com.zzm._001PureProgramming;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Mingson
 * @version 1.0
 */
public class _001twoSumTest {

    @Test
    public void test1() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] twoSum = new _001twoSum().twoSum(nums, target);
        System.out.println(Arrays.toString(twoSum));
    }

    @Test
    public void test2() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] twoSum = new _001twoSum().twoSum(nums, target);
        System.out.println(Arrays.toString(twoSum));
    }

    @Test
    public void test3() {
        int[] nums = {3,3};
        int target = 6;
        int[] twoSum = new _001twoSum().twoSum(nums, target);
        System.out.println(Arrays.toString(twoSum));
    }
}
