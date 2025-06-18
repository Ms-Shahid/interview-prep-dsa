package io.algoexpert.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransposeMatrixTest {

    @Test
    @DisplayName("Transpose Matrix")
    public void transposeMatrixTestCase1(){
        int[][] input = new int[][] {{0, -1, -2, -3}, {4, 5, 6, 7}, {2, 3, -2, -3}, {42, 100, 30, -42}};
        int[][] expected = new int[][] {{0, 4, 2, 42}, {-1, 5, 3, 100}, {-2, 6, -2, 30}, {-3, 7, -3, -42}};
        int[][] actual = new io.algoexpert.arrays.TransposeMatrix().transposeMatrix(input);

        assertTrue(expected.length == actual.length );

        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected[i].length; j++) {
                assertTrue(expected[i][j] == actual[i][j]);
            }
        }
    }
}
