class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        List<Integer> result = new ArrayList<>();

        int startRow = 0;
        int endRow = rows - 1;
        int startCol = 0;
        int endCol = cols - 1;

        while (startRow <= endRow && startCol <= endCol) {

            //row left to right-> print startingRow = from startingCol to endCol
            for (int col = startCol; col <= endCol; col++) {
                result.add(matrix[startRow][col]);
            }
            startRow++;
            //col top to bottom->print endingCol =from starinRow to EndingRow
            for (int row = startRow; row <= endRow; row++) {
                result.add(matrix[row][endCol]);
            }
            endCol--;
            //row right to left->print endRow=from endCol to startingCol
            if (startRow <= endRow) {
                for (int col = endCol; col >= startCol; col--) {
                    result.add(matrix[endRow][col]);
                }
                endRow--;
            }
            //col bottom to top->print startCol= from endingRow to StrintingRow
            if (startCol <= endCol) {
                for (int row = endRow; row >= startRow; row--) {
                    result.add(matrix[row][startCol]);
                }
                startCol++;
            }

        }
        return result;
    }
}