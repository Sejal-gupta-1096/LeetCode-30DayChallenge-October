class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        
        int row = matrix.length;
        if(row == 0) return false;
        int col = matrix[0].length;
        System.out.println(row + " " + col);
        return searchMatrix(matrix , target , 0 , (row*col)-1 , row , col);
    }
    
    public boolean searchMatrix(int[][] matrix , int target , int si , int ei , int row , int col){
        
        if(si > ei){
            return false;
        }
        
        int mid = (si+ei)/2;
        int i = mid/col;
        int j = mid%col;
        
        
        if(i >= row || j >= col) return false;
        if(matrix[i][j] == target) return true;
        
        if(matrix[i][j] > target) return searchMatrix(matrix , target , si , mid-1 , row , col);
        
        else return searchMatrix(matrix , target , mid+1 , ei , row , col);
    }
}