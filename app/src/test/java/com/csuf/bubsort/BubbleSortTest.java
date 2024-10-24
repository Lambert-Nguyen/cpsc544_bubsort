/*
 * <!--
 *   ~ /**
 *   ~  * File       : $com.csuf.bubsort.test
 *   ~  * Brief      : BubbleSortTest Junit Java Class file
 *   ~  * Author     : Nguyen Phuong Duy Lam
 *   ~  * Last Edited: Nguyen Phuong Duy Lam
 *   ~  * Created On : 17/October/2024
 *   ~  * Details    :
 *   ~  * <p>
 *   ~  * *****************************************************************************************
 *   ~  * *****   Copyright 2024. Cal State Fullerton. All rights reserved - CONFIDENTIAL *********
 *   ~  * *****************************************************************************************
 *   ~
 *   -->
 */
package com.csuf.bubsort;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;

public class BubbleSortTest {

    // Test ascending sort with a valid unsorted array
    @Test
    public void testBubbleSortWithUnsortedArray() {
        int[] array = {9, 8, 7, 6, 5};
        String expected = "Input Array: [9, 8, 7, 6, 5]\n" +
                "[8, 9, 7, 6, 5]\n" +
                "[8, 7, 9, 6, 5]\n" +
                "[8, 7, 6, 9, 5]\n" +
                "[8, 7, 6, 5, 9]\n" +
                "End of iteration 1\n\n" +
                "[7, 8, 6, 5, 9]\n" +
                "[7, 6, 8, 5, 9]\n" +
                "[7, 6, 5, 8, 9]\n" +
                "End of iteration 2\n\n" +
                "[6, 7, 5, 8, 9]\n" +
                "[6, 5, 7, 8, 9]\n" +
                "End of iteration 3\n\n" +
                "[5, 6, 7, 8, 9]\n" +
                "End of iteration 4\n\n" +
                "Sorted Array: [5, 6, 7, 8, 9]\n";
        assertEquals(expected, BubbleSort.sortWithSteps(array, false));  // Ascending sort
    }

    // Test reverse sort with a valid unsorted array
    @Test
    public void testReverseBubbleSortWithUnsortedArray() {
        int[] array = {5, 3, 8, 4, 2, 7};
        String expected = "{8, 7, 5, 4, 3, 2}";
        assertEquals(expected, BubbleSort.sortWithSteps(array, true));  // Reverse sort
    }

    // Test ascending sort with an empty array
    @Test
    public void testBubbleSortWithEmptyArray() {
        int[] array = {};
        String[] expected = {};
        assertEquals(expected, BubbleSort.sortWithSteps(array, false));  // Ascending sort
    }

    // Test ascending sort with a single element
    @Test
    public void testBubbleSortWithSingleElement() {
        int[] array = {1};
        String expected = "{1}";
        assertEquals(expected, BubbleSort.sortWithSteps(array, false));  // Ascending sort
    }

    // Test ascending sort with an already sorted array
    @Test
    public void testBubbleSortWithAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        String expected = "{1, 2, 3, 4, 5}";
        assertEquals(expected, BubbleSort.sortWithSteps(array, false));  // Ascending sort
    }

    // Test reverse sort with an already sorted array in ascending order
    @Test
    public void testReverseBubbleSortWithAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        String expected = "{5, 4, 3, 2, 1}";
        assertEquals(expected, BubbleSort.sortWithSteps(array, true));  // Reverse sort
    }

    // Test reverse sort with an already sorted array in descending order
    @Test
    public void testReverseBubbleSortWithReversedArray() {
        int[] array = {9, 8, 7, 6, 5};
        String expected = "{9, 8, 7, 6, 5}";
        assertEquals(expected, BubbleSort.sortWithSteps(array, true));  // Reverse sort
    }

    // Test for input validation (check invalid number range - below 0 and above 9)
    @Test
    public void testInvalidInputBelowRange() {
        int[] array = {-1, 2, 3};  // Invalid number (-1)
        try {
            BubbleSort.sortWithSteps(array, false);
        } catch (IllegalArgumentException e) {
            assertEquals("Each number must be between 0 and 9.", e.getMessage());
        }
    }

    @Test
    public void testInvalidInputAboveRange() {
        int[] array = {2, 11, 3};  // Invalid number (11)
        try {
            BubbleSort.sortWithSteps(array, false);
        } catch (IllegalArgumentException e) {
            assertEquals("Each number must be between 0 and 9.", e.getMessage());
        }
    }

    // Test for array size validation (too few numbers)
    @Test
    public void testTooFewNumbers() {
        int[] array = {1, 2};  // Less than 3 numbers
        try {
            BubbleSort.sortWithSteps(array, false);
        } catch (IllegalArgumentException e) {
            assertEquals("Input must contain between 3 and 8 numbers.", e.getMessage());
        }
    }

    // Test for array size validation (too many numbers)
    @Test
    public void testTooManyNumbers() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};  // More than 8 numbers
        try {
            BubbleSort.sortWithSteps(array, false);
        } catch (IllegalArgumentException e) {
            assertEquals("Input must contain between 3 and 8 numbers.", e.getMessage());
        }
    }
}
