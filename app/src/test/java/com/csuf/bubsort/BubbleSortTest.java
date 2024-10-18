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

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSortWithUnsortedArray() {
        int[] array = {5, 3, 8, 4, 2, 7};
        int[] expected = {2, 3, 4, 5, 7, 8};
        assertArrayEquals(expected, BubbleSort.sort(array));
    }

    @Test
    public void testBubbleSortWithEmptyArray() {
        int[] array = {};
        int[] expected = {};
        assertArrayEquals(expected, BubbleSort.sort(array));
    }

    @Test
    public void testBubbleSortWithSingleElement() {
        int[] array = {1};
        int[] expected = {1};
        assertArrayEquals(expected, BubbleSort.sort(array));
    }

    @Test
    public void testBubbleSortWithAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, BubbleSort.sort(array));
    }

    @Test
    public void testBubbleSortWithReversedArray() {
        int[] array = {9, 8, 7, 6, 5};
        int[] expected = {5, 6, 7, 8, 9};
        assertArrayEquals(expected, BubbleSort.sort(array));
    }
}
