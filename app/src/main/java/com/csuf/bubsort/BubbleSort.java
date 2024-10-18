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

public class BubbleSort {
    public static int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
