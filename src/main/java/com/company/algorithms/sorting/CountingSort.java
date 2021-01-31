package com.company.algorithms.sorting;

public class CountingSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 1, 9, 12, 6, 5};
        printArr(countingSort(arr, 12));
    }

    public static int[] countingSort(int[] arr, int k) {

        // create counting array, "k + 1" for max number
        int[] count = new int[k + 1];

        // create output array
        int[] output = new int[arr.length];

        // count of each unique object
        for (int i : arr)
            ++count[i];

        // each element at each index stores the sum of previous counts
        for (int i = 2; i < count.length; ++i)
            count[i] += count[i - 1];

        // sorting...
        for (int i = arr.length - 1; i >= 0; i--)
            output[count[arr[i]]-- - 1] = arr[i];

        return output;
    }

    public static void printArr(int[] arr) {  // print method
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}