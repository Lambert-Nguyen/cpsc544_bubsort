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
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputArrayEditText;
    private TextView stepsTextView;
    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputArrayEditText = findViewById(R.id.editTextText);  // User input EditText
        stepsTextView = findViewById(R.id.editTextView);  // TextView to display steps

        Button sortButton = findViewById(R.id.sortButton);  // Sort button
        Button reverseSortButton = findViewById(R.id.reverseSortButton);  // Reverse sort button
        Button resetButton = findViewById(R.id.resetButton);  // Reset button
        Button quitButton = findViewById(R.id.quitButton);  // Quit button

        // Sort button logic (ascending order)
        sortButton.setOnClickListener(v -> sortUserInput(false));

        // Reverse sort button logic (descending order)
        reverseSortButton.setOnClickListener(v -> sortUserInput(true));

        // Reset button logic
        resetButton.setOnClickListener(v -> resetFields());

        // Quit button logic
        quitButton.setOnClickListener(v -> finish());  // Close the app
    }

    // Method to sort the user-input array and display steps
    private void sortUserInput(boolean reverse) {
        String inputText = inputArrayEditText.getText().toString().trim();
        Log.d(TAG, "sortUserInput: inputText: " + inputText);

        if (!inputText.isEmpty()) {
            try {
                // Split input by commas and convert to integers
                String[] stringArray = inputText.split(",");

                // Validate array size (must be between 3 and 8 numbers)
                if (stringArray.length < 3 || stringArray.length > 8) {
                    Toast.makeText(this, "Input must contain between 3 and 8 numbers.", Toast.LENGTH_SHORT).show();
                    return;
                }

                int[] intArray = new int[stringArray.length];
                for (int i = 0; i < stringArray.length; i++) {
                    int number = Integer.parseInt(stringArray[i].trim());
                    if (number < 0 || number > 9) {
                        Toast.makeText(this, "Each number must be between 0 and 9.", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    intArray[i] = number;
                }

                // Call BubbleSort class to sort the array with the correct order (ascending or descending)
                String steps = BubbleSort.sortWithSteps(intArray, reverse);
                Log.d(TAG, "sortUserInput: " + steps);

                // Display the sorting steps in the TextView
                stepsTextView.setText(steps);
                stepsTextView.setMovementMethod(new ScrollingMovementMethod());

            } catch (NumberFormatException e) {
                // Handle invalid input
                Toast.makeText(this, "Invalid input. Please enter integer numbers separated by commas.", Toast.LENGTH_SHORT).show();
            }
        } else {
            // Handle empty input
            Toast.makeText(this, "Please enter integer numbers separated by commas.", Toast.LENGTH_SHORT).show();
        }
    }

    // Reset input and output fields
    private void resetFields() {
        inputArrayEditText.setText("");
        stepsTextView.setText("Array has been reset.");
    }
}

