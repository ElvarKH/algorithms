package com.company.algorithms.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 10, 0, 4};
        insertionSort(arr);
        printArr(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
    }

    static void printArr(int[] arr) {
        System.out.print("| ");
        for (int value : arr)
            System.out.print(value + " | ");
        System.out.println();
    }
}
