# CSUF CPSC 541 - Systems and Software Standards and Requirements 
# BubSort Application - Group 1

## Project Overview
BubSort is an Android application developed by Group 1 as part of the CPSC 544 project 1. This app implements the Bubble Sort algorithm, allowing users to input a list of numbers and visualize the sorting process step-by-step in both ascending and descending order.

---

## Installation Instructions

### 1. Download the APK File
- Download the file named `BubSort_Group1.apk` to your Android device.

### 2. Enable Installation from Unknown Sources
- Go to **Settings > Security > Unknown Sources** on your Android device and enable it. This step allows you to install apps from sources other than the Google Play Store.

### 3. Install the APK
- Using your file manager, locate `BubSort_Group1.apk` on your device and tap on it to start the installation.

---

## Running the App on an Android Emulator

If you don’t have an Android device, you can use the Android Emulator in Android Studio to run the BubSort app. Follow these steps to set up the emulator and install the APK.

### Step 1: Install Android Studio
1. **Download Android Studio**:
   - Visit [https://developer.android.com/studio](https://developer.android.com/studio) and download the latest version for your operating system (Windows, macOS, or Linux).
2. **Install Android Studio**:
   - Follow the installation prompts. Once installed, open Android Studio.

### Step 2: Set Up an Android Virtual Device (AVD)
1. **Open AVD Manager**:
   - In Android Studio, go to **Tools > Device Manager** or click the **Device Manager icon** in the toolbar.
2. **Create a New Virtual Device**:
   - Click **Create Device**.
   - Select a device type (e.g., **Pixel 4**) and click **Next**.
3. **Select a System Image**:
   - Choose a system image. (Tip: Select an image marked **Recommended** for stability.)
   - Click **Next**, then **Finish** to complete the setup.

### Step 3: Launch the Emulator
1. **Open the Emulator**:
   - In the Device Manager, find your virtual device and click the **Play icon** to start the emulator. It may take a minute or two to load.

### Step 4: Install the APK on the Emulator
1. **Drag and Drop the APK**:
   - Locate the `BubSort_Group1.apk` file on your computer.
   - Drag and drop the APK file directly onto the running emulator screen.
2. **Confirm Installation**:
   - Follow the prompts to install the app on the emulator.
   - Once installed, find and open **BubSort** in the emulator’s app drawer.

### You're All Set!
You can now use the BubSort app on the emulator as if it were a physical Android device.

---

## Usage Instructions

### 1. Launch the Application
- Once installed, open the BubSort application from your app drawer.

### 2. Input Array
- Enter a list of numbers separated by commas in the input field. Ensure the array meets these requirements:
  - **Size**: Between 3 and 8 numbers.
  - **Range**: Each number should be between 0 and 9.
  - Example: `5, 3, 8, 4, 2`

### 3. Sort Options
- **Sort**: Tap this button to perform Bubble Sort in ascending order. The app will display each step of the sorting process.
- **Reverse Sort**: Tap this button to perform Bubble Sort in descending order, showing the intermediate steps as well.

### 4. Additional Features
- **Reset**: Clears both the input and output fields, allowing you to start a new sort.
- **Quit**: Closes the application.

---

## Example of Usage
- **Input**: `5, 3, 8, 4, 2`
- **Output** (Ascending Sort): 
  - Initial Array: `[5, 3, 8, 4, 2]`
  - Intermediate Steps: `[3, 5, 4, 2, 8]`, `[3, 4, 2, 5, 8]`, and so on.
  - Sorted Array: `[2, 3, 4, 5, 8]`

---

## Group Information

- **Group Number**: 1
- **Project Title**: BubSort Application
- **Instructor**: Swayam Pati
- **Group Members**:
  - Phuong Duy Lam, Nguyen
  - Christy, Xiu
  - Natan, Rincon Luna
  - Huy, Nguyen
  - Zhihao, Zhang
- **Submission Date**: Oct 25, 2024

---

## License
This project is for educational purposes as part of the CPSC 544 course at Cal State Fullerton.

