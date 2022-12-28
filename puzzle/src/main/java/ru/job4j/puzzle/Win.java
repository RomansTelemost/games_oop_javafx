package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (checkHorizontal(board, i) || checkVertical(board, i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkHorizontal(int[][] board, int row) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkVertical(int[][] board, int column) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 1) {
                return false;
            }
        }
        return true;
    }
}
