
class Solution {

        static void reverseArray(int arr[]){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        for (int k:arr){
            System.out.println(k);
        }
    }


    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = i+1; j < cols; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0;i<rows;i++){
            reverseArray(matrix[i]);
        }


    }
}