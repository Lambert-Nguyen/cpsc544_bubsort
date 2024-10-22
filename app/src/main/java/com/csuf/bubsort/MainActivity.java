/*
 * <!--
 *   ~ /**
 *   ~  * File       : $com.csuf.bubsort.MainActivity
 *   ~  * Brief      : Java Class File for UI Main Activity
 *   ~  * Author     : Nguyen Phuong Duy Lam
 *   ~  * Created On : 18/October/2024
 *   ~  * Last Edited: Nguyen Phuong Duy Lam
 *   ~  * Edited Date: 21/October/2024
 *   ~  * Details    :
 *   ~  * <p>
 *   ~  * *****************************************************************************************
 *   ~  * *****   Copyright 2024. Cal State Fullerton. All rights reserved - CONFIDENTIAL *********
 *   ~  * *****************************************************************************************
 *   ~
 *   -->
 */
package com.csuf.bubsort;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView sortedArrayTextView;
    private int[] array = {5, 3, 8, 4, 2, 7};  // Initial example array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sortedArrayTextView = findViewById(R.id.sortedArrayTextView);
        Button resetButton = findViewById(R.id.resetButton);

        // Display the sorted array
        displaySortedArray();

        // Handle reset button click
        resetButton.setOnClickListener(view -> resetArray());
    }

    private void displaySortedArray() {
        // Call the BubbleSort class to sort the array
        int[] sortedArray = BubbleSort.sort(array);
        // Display the sorted array in the TextView
        sortedArrayTextView.setText("Sorted Array: " + java.util.Arrays.toString(sortedArray));
    }

    private void resetArray() {
        // Reset the array to a new state (e.g., the initial state or an empty state)
        array = new int[] {};  // Clear the array or set it to its original state
        // Clear the TextView
        sortedArrayTextView.setText("Array has been reset.");
    }
}


