package com.zzm._002FindRules;

/**
 * @author Mingson
 * @version 1.0
 */
public class _001setZeroes {
    /*
    输入：
    [
      [1,1,1],
      [1,0,1],
      [1,1,1]
    ]
    输出：
    [
      [1,0,1],
      [0,0,0],
      [1,0,1]
    ]
     */
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) return;
        int m = matrix[0].length;
        boolean[] row = new boolean[n];
        boolean[] column = new boolean[m];
        // 搜索哪一行哪一列需要清零
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // 清零
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || column[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
