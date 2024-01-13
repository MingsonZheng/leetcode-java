package com.zzm._002FindRules;

/**
 * @author Mingson
 * @version 1.0
 */
public class _006tictactoe {
    public String tictactoe(String[] board) {
        /*
        示例 1：
        输入： board = ["O X"," XO","X O"]
        输出： "X"
        示例 2：
        输入： board = ["OOX","XXO","OXO"]
        输出： "Draw"
        示例 3：
        输入： board = ["OOX","XXO","OX "]
        输出： "Pending"
         */
        int n = board.length;
        char[][] chars = new char[n][n];
        for (int i = 0; i < n; i++) {
            chars[i] = board[i].toCharArray();
        }
        // "O X",
        // " XO",
        // "X O"
        // 判断行
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (chars[i][0] == ' ') continue;// 避免整行为空
            flag = true;
            for (int j = 1; j < n; j++) {
                if (chars[i][j] != chars[i][0]) {
                    flag = false;
                    break;
                }
            }
            if (flag) return chars[i][0] + "";
        }
        // "O X",
        // " XO",
        // "X O"
        // 判断列
        for (int j = 0; j < n; j++) {
            if (chars[0][j] == ' ') continue;// 避免整列为空
            flag = true;
            for (int i = 1; i < n; i++) {
                if (chars[i][j] != chars[0][j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) return chars[0][j] + "";
        }
        // "O X",
        // " XO",
        // "X O"
        // 判断对角线，左上-> 右下
        if (chars[0][0] != ' ') {// 避免对角线全为空
            int i = 1;
            int j = 1;
            flag = true;
            while (i < n) {
                if (chars[i][j] != chars[0][0]) {
                    flag = false;
                    break;
                }
                i++;
                j++;
            }
            if (flag) return chars[0][0] + "";
        }
        // "O X",
        // " XO",
        // "X O"
        // 判断对角线，左下-> 右上
        if (chars[n-1][0] != ' ') {// 避免对角线全为空
            int i = n-2;
            int j = 1;
            flag = true;
            while (j < n) {
                if (chars[i][j] != chars[n-1][0]) {
                    flag = false;
                    break;
                }
                i--;
                j++;
            }
            if (flag) return chars[n-1][0] + "";
        }
        // 判断是否有空格，无则结束，有则继续
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (chars[i][j] == ' ') {
                    return "Pending";
                }
            }
        }
        return "Draw";
    }
}
