package com.company.algorithms.sorting;

public class BubbleSort {

    public static void main(String[] args) {

        // Test Bubble Sort
//        int[] arr = new int[]{5, 3, 10, 0, 4};
        int[] arr = new int[]{1, 2, 3};
        bubbleSort(arr);
        printArr(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean isSorted = true;  // flag

        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }

        if (isSorted) {
            System.out.println("Already sorted");
            return;
        }

        System.out.println("Sorting");
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - 1 - i; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void printArr(int[] arr) {
        System.out.print("| ");

        for (int value : arr)
            System.out.print(value + " | ");
    }
}
