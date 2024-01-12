package com.zzm._002FindRules;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _001setZeroesTest {

    @Test
    public void test1() {
        // [[1,1,1],[1,0,1],[1,1,1]]
        int[][] matrix = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        new _001setZeroes().setZeroes(matrix);
        // [[1,0,1],[0,0,0],[1,0,1]]
        int[][] expectedMatrix = new int[][]{{1,0,1},{0,0,0},{1,0,1}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                assert matrix[i][j] == expectedMatrix[i][j];
            }
        }
    }

    @Test
    public void test2() {
        // [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
        int[][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        new _001setZeroes().setZeroes(matrix);
        // [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
        int[][] expectedMatrix = new int[][]{{0,0,0,0},{0,4,5,0},{0,3,1,0}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                assert matrix[i][j] == expectedMatrix[i][j];
            }
        }
    }
}
