class Solution {
    public void gameOfLife(int[][] board) {
        // Create a copy of the original board to avoid modifying it while iterating
        int[][] copyBoard = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                copyBoard[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int live = countLiveNeighbors(copyBoard, i, j);
                if (copyBoard[i][j] == 1) {
                    if (live < 2 || live > 3) {
                        board[i][j] = 0; // Cell dies
                    } else {
                        board[i][j] = 1; // Cell lives
                    }
                } else {
                    if (live == 3) {
                        board[i][j] = 1; // Cell becomes alive
                    }
                }
            }
        }
    }

    private int countLiveNeighbors(int[][] board, int i, int j) {
        int live = 0;
        int[][] directions = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
        };

        for (int[] direction : directions) {
            int newRow = i + direction[0];
            int newCol = j + direction[1];
            if (newRow >= 0 && newRow < board.length && newCol >= 0 && newCol < board[0].length) {
                if (board[newRow][newCol] == 1) {
                    live++;
                }
            }
        }

        return live;
    }
}
