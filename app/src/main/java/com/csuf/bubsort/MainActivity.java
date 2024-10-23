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

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;

    private TextView sortedArrayTextView;
    private TextView dialogTextView;
    private int[] array = {5, 3, 8, 4, 2, 7};  // Initial example array
    private int[] sortedArray = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sortedArrayTextView = findViewById(R.id.MainTextView);
        dialogTextView = findViewById(R.id.editTextText2);
        Button resetButton = findViewById(R.id.resetButton);
        sortedArrayTextView.setText("Welcome to BubSort Application");


        // Display the sorted array
        displaySortedArray();

        // Handle reset button click
        resetButton.setOnClickListener(view -> confirmReset());  // Call confirmReset here

        // Display the sorted array on the UI
        TextView outputView = findViewById(R.id.editTextView);
        outputView.setText(Arrays.toString(sortedArray));

        // Declare animation objects
        Animation wiggleAnimation = AnimationUtils.loadAnimation(this, R.anim.wiggle);
        Animation wiggleAnimation2 = AnimationUtils.loadAnimation(this, R.anim.wiggle2);
        Animation wiggleAnimation3 = AnimationUtils.loadAnimation(this, R.anim.wiggle3);

        imageView4 = findViewById(R.id.imageView4);
        imageView4.startAnimation(wiggleAnimation2);

        imageView5 = findViewById(R.id.imageView5);
        imageView5.startAnimation(wiggleAnimation);

        imageView6 = findViewById(R.id.imageView6);
        imageView6.startAnimation(wiggleAnimation2);

        imageView7 = findViewById(R.id.imageView7);
        imageView7.startAnimation(wiggleAnimation);

        imageView8 = findViewById(R.id.imageView8);
        imageView8.startAnimation(wiggleAnimation3);
    }

    private void displaySortedArray() {
        // Call the BubbleSort class to sort the array
        sortedArray = BubbleSort.sort(array);
        // Display the sorted array in the TextView
//        MainTextView.setText("Sorted Array: " + java.util.Arrays.toString(sortedArray));
    }

    private void resetArray() {
        // Reset the array to a new state (e.g., the initial state or an empty state)
        array = new int[] {};  // Clear the array or set it to its original state
        // Clear the TextView
        dialogTextView.setText("Array has been reset.");
    }

    private void confirmReset() {
        new AlertDialog.Builder(this)
                .setTitle("Confirm Reset")
                .setMessage("Are you sure you want to reset the array?")
                .setPositiveButton("Yes", (dialog, which) -> resetArray())
                .setNegativeButton("No", null)
                .show();
    }
}

