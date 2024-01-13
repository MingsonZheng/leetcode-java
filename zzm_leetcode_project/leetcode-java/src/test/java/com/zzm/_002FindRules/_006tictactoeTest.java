package com.zzm._002FindRules;

import org.junit.Test;

/**
 * @author Mingson
 * @version 1.0
 */
public class _006tictactoeTest {

    @Test
    public void test1() {
        String[] board = new String[]{"O X"," XO","X O"};
        String result = new _006tictactoe().tictactoe(board);
        String expectedResult = "X";
        assert result.equals(expectedResult);
    }

    @Test
    public void test2() {
        String[] board = new String[]{"OOX","XXO","OXO"};
        String result = new _006tictactoe().tictactoe(board);
        String expectedResult = "Draw";
        assert result.equals(expectedResult);
    }

    @Test
    public void test3() {
        String[] board = new String[]{"OOX","XXO","OX "};
        String result = new _006tictactoe().tictactoe(board);
        String expectedResult = "Pending";
        assert result.equals(expectedResult);
    }

    @Test
    public void test4() {
        String[] board = new String[]{
                "   X O  O ",
                " X X    O ",
                "X  X    O ",
                "X    OX O ",
                "X   XO  O ",
                "X  X O  O ",
                "O  X O  O ",
                "     O  OX",
                "     O  O ",
                "   X XXXO "};
        String result = new _006tictactoe().tictactoe(board);
        String expectedResult = "O";
        assert result.equals(expectedResult);
    }

    @Test
    public void test5() {
        String[] board = new String[]{
                "                             ",
                "                     O       ",
                "         X           X       ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "                      O      ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "                             ",
                "      X                      ",
                "                             ",
                "                             ",
                "      O                      ",
                "                             ",
                "                             "};
        String result = new _006tictactoe().tictactoe(board);
        String expectedResult = "Pending";
        assert result.equals(expectedResult);
    }
}
