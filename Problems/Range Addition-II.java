https://leetcode.com/problems/range-addition-ii/

class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minRow = m;
        int minCol = n;

        for (int operations[] : ops) {
            int row = operations[0];
            int col = operations[1];

            minRow = Math.min(minRow, row);
            minCol = Math.min(minCol, col);
        }

        return minRow * minCol;
    }
}
