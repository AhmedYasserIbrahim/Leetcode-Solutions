class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        
        int m = board.length;
        int n = board[0].length;
        
        // Step 1: Flag all 'O's on the border and their connected components as safe (not to be flipped)
        for (int i = 0; i < m; i++) {
            // Check the first and last column in each row
            if (board[i][0] == 'O') {
                markSafe(board, i, 0);
            }
            if (board[i][n - 1] == 'O') {
                markSafe(board, i, n - 1);
            }
        }
        
        for (int j = 0; j < n; j++) {
            // Check the first and last row in each column
            if (board[0][j] == 'O') {
                markSafe(board, 0, j);
            }
            if (board[m - 1][j] == 'O') {
                markSafe(board, m - 1, j);
            }
        }
        
        // Step 2: Go through the board and capture all non-safe 'O's by flipping them to 'X'
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X'; // Flip surrounded 'O' to 'X'
                } else if (board[i][j] == 'S') {
                    board[i][j] = 'O'; // Convert 'S' back to 'O'
                }
            }
        }
    }
    
    // Helper method to mark safe (non-surrounded) 'O's as 'S'
    private void markSafe(char[][] board, int i, int j) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        
        board[i][j] = 'S'; // Mark this 'O' as safe (connected to border or another safe 'O')
        
        // Check all four directions (up, down, left, right)
        markSafe(board, i + 1, j);
        markSafe(board, i - 1, j);
        markSafe(board, i, j + 1);
        markSafe(board, i, j - 1);
    }
}
