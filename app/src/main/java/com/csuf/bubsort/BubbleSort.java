/*
 * <!--
 *   ~ /**
 *   ~  * File       : $com.csuf.bubsort.BubbleSort
 *   ~  * Brief      : Java Class File for Bubble Sort Function
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

import java.util.Arrays;

public class BubbleSort {

    public static String sortWithSteps(int[] array) {
        StringBuilder steps = new StringBuilder();  // To store intermediate steps
        int n = array.length;

        // Initial array display
        steps.append("Input Array: ").append(Arrays.toString(array)).append("\n");

        // BubbleSort algorithm with logging of each step
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }

                // Log the array after each comparison
                steps.append(Arrays.toString(array)).append("\n");
            }

            // If no elements were swapped, the array is sorted
            if (!swapped) break;

            // Mark the end of each iteration
            steps.append("End of iteration ").append(i + 1).append("\n\n");
        }

        // Final sorted array
        steps.append("Sorted Array: ").append(Arrays.toString(array)).append("\n");
        return steps.toString();
    }
}

