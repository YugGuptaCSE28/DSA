class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = 0;
        int col = matrix[0].length-1;

        while (row<matrix.length && col >=0){
            // key found
            if (matrix[row][col] == target){
                return true;
            }
            // key is less than element
            else if(target < matrix[row][col]){
                col--;
            }
            //key is greater than element
            else{
                row++;
            }
        }
        return false;
    }
}