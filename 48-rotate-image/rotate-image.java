
class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < rows; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < rows; i++) {
            int start = 0;
            int end = rows - 1;
            while (end > start) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }

    }
}