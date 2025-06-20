package io.algoexpert.arrays;
import java.util.*;

public class TwoNumberSystem {
    /*
    * Two Number Sum
    Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. If any two numbers in the input array sum up to the target sum, the function should return them in an array, in any order. If no two numbers sum up to the target sum, the function should return an empty array.
    Note that the target sum has to be obtained by summing two different integers in the array; you can't add a single integer to itself in order to obtain the target sum.
    You can assume that there will be at most one pair of numbers summing up to the target sum.
    Sample Input
    array = [3, 5, -4, 8, 11, 1, −1, 6]
    targetSum = 10
    Sample Output = [-1, 11] // the numbers could be in reverse order
    * */

    public static int[] twoNumberSumSolution1(int[] array, int targetSum){

        // TC : O(N*N), SC : O(1)
        int  n = array.length;

        for(int i = 0; i < n; i++ ){
            int searchValue = targetSum - array[i];

            for(int j = i + 1; j < n; j++ ){
                if( searchValue == array[j] ) return new int[]{array[i], searchValue};
            }
        }
        return new int[]{};
    }
}
