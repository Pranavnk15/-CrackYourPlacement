// 54. Spiral Matrix
// Given an m x n matrix, return all elements of the matrix in spiral order.


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    //    List<Integer> ans = new ArrayList<>();

    //    int rowStart = 0;
    //    int colStart = 0;
    //    int rowEnd = matrix.length-1;
    //    int colEnd = matrix[0].length-1;
    //     while(rowStart<=rowEnd && colStart<=colEnd) {
    //    //right
    //    for(int i = colStart; i<=colEnd; i++) {
    //        ans.add(matrix[rowStart][i]);
    //    }
    //    rowStart++;

    //    //down
    //    for(int i = rowStart; i<=rowEnd; i++) {
    //        ans.add(matrix[i][colEnd]);
    //    }
    //    colEnd--;

    //    //left
    //    if(rowStart<=rowEnd && colStart<=colEnd) {
    //        for(int i = colEnd; i >= colStart; i--) {
    //            ans.add(matrix[rowEnd][i]);
    //        }
    //    }
    //    rowEnd--;

    //    //up
    //    if(rowStart<=rowEnd && colStart <= colEnd) {  
    //    for(int i = rowEnd; i>= rowStart; i--) {
    //        ans.add(matrix[i][colStart]);
    //    } 
    //    }   
    //    colStart++;
    //     }
    //     return ans;
    List<Integer> ans = new ArrayList<>();
        int rowStart = 0;
        int colStart = 0;
        int rowEnd = matrix.length-1;
        int colEnd = matrix[0].length-1;

        while(rowStart <= rowEnd && colStart <= colEnd) {

            //right
            for(int i = colStart; i<= colEnd; i++) {
                ans.add(matrix[rowStart][i]);
            }
            rowStart++;

            //down
            for(int i = rowStart; i<= rowEnd; i++) {
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;

            //left
            if(rowStart <= rowEnd && colStart <= colEnd) {
                 for(int i = colEnd; i>= colStart; i--) {
                     ans.add(matrix[rowEnd][i]);
                  }
            }
            rowEnd--;

            //up
            if(rowStart <= rowEnd && colStart <= colEnd) {
                for(int i = rowEnd; i>= rowStart; i--) {
                    ans.add(matrix[i][colStart]);
                }
            }
            colStart++;
        }
        return ans;
    }
}