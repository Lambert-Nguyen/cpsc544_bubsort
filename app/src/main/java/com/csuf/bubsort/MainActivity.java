/*
 * <!--
 *   ~ /**
 *   ~  * File       : $com.csuf.bubsort.MainActivity
 *   ~  * Brief      : Java Class File for UI Main Activity
 *   ~  * Author     : Nguyen Phuong Duy Lam
 *   ~  * Created On : 18/October/2024
 *   ~  * Last Edited: Nguyen Phuong Duy Lam
 *   ~  * Edited Date: 23/October/2024
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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputArrayEditText;
    private TextView sortedArrayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find UI elements by ID
        inputArrayEditText = findViewById(R.id.editTextText);  // User input
        sortedArrayTextView = findViewById(R.id.editTextView);  // Display sorted array

        Button sortButton = findViewById(R.id.sortButton);  // Sort button
        Button reverseSortButton = findViewById(R.id.reverseSortButton);  // Reverse sort button
        Button resetButton = findViewById(R.id.resetButton);  // Reset button
        Button quitButton = findViewById(R.id.quitButton);  // Quit button

        // Set up button functionality
        sortButton.setOnClickListener(v -> sortUserInput(false));
        reverseSortButton.setOnClickListener(v -> sortUserInput(true));
        resetButton.setOnClickListener(v -> resetFields());
        quitButton.setOnClickListener(v -> finish());  // Close the app
    }

    // Method to sort the user-input array, either in ascending or descending order
    private void sortUserInput(boolean reverse) {
        String inputText = inputArrayEditText.getText().toString().trim();

        if (!inputText.isEmpty()) {
            try {
                // Split input by commas and convert to integers
                String[] stringArray = inputText.split(",");
                int[] intArray = new int[stringArray.length];
                for (int i = 0; i < stringArray.length; i++) {
                    intArray[i] = Integer.parseInt(stringArray[i].trim());
                }

                // Sort the array using BubbleSort
                int[] sortedArray = BubbleSort.sort(intArray);

                // Reverse the array if reverse sorting is requested
                if (reverse) {
                    reverseArray(sortedArray);
                }

                // Display the sorted array
                sortedArrayTextView.setText("Sorted Array: " + java.util.Arrays.toString(sortedArray));

            } catch (NumberFormatException e) {
                // Handle invalid input
                Toast.makeText(this, "Invalid input. Please enter numbers separated by commas.", Toast.LENGTH_SHORT).show();
            }
        } else {
            // Handle empty input
            Toast.makeText(this, "Please enter numbers separated by commas.", Toast.LENGTH_SHORT).show();
        }
    }

    // Method to reverse an array
    private void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    // Reset input and output fields
    private void resetFields() {
        inputArrayEditText.setText("");
        sortedArrayTextView.setText("Array has been reset.");
    }
}
