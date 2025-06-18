package io.algoexpert.arrays;

public class TransposeMatrix {

    public int[][] transposeMatrix(int[][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposeMatrix = new int[cols][rows];
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                transposeMatrix[col][row] = matrix[row][col];
            }
        }
        return transposeMatrix;
    }
}
