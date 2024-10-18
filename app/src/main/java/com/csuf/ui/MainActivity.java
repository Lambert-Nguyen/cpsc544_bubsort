/*
 * <!--
 *   ~ /**
 *   ~  * File       : $com.csuf.ui
 *   ~  * Brief      : Java Class File for UI Main Activity
 *   ~  * Author     : Nguyen Phuong Duy Lam
 *   ~  * Last Edited: Nguyen Phuong Duy Lam
 *   ~  * Created On : 18/October/2024
 *   ~  * Details    :
 *   ~  * <p>
 *   ~  * *****************************************************************************************
 *   ~  * *****   Copyright 2024. Cal State Fullerton. All rights reserved - CONFIDENTIAL *********
 *   ~  * *****************************************************************************************
 *   ~
 *   -->
 */
package com.csuf.ui;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.csuf.bubsort.BubbleSort;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example input array
        int[] array = {5, 3, 8, 4, 2, 7};

        // Sort the array using BubbleSort business logic
        int[] sortedArray = BubbleSort.sort(array);

        // Display the sorted array on the UI
        TextView outputView = findViewById(R.id.sortedArrayTextView);
        outputView.setText(Arrays.toString(sortedArray));
    }
}

