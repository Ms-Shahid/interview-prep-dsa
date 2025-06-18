package io.algoexpert.arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoNumberSystemTest {

    @Test
    @DisplayName("Two Number Sum Test case")
    public void TestCase(){
        int[] output = io.algoexpert.arrays.TwoNumberSystem.twoNumberSumSolution1(
                new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10
        );
        assertEquals( output.length, 2);
        assertTrue(contains(output, -1));
        assertTrue(contains(output, 11));
    }

    public boolean contains(int[] output, int val) {
        for (int el : output) {
            if (el == val) return true;
        }
        return false;
    }
}
