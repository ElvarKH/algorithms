package com.company.algorithms.searching;

import com.company.algorithms.sorting.BubbleSort;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // CreateRandomWordsFromText Binary Search
        int[] arr = new int[]{5, 3, 10, 0, 4};               // unsorted
        System.out.print("Before com.company.algorithms.sorting: ");
        printArr(arr);

        BubbleSort.bubbleSort(arr);                          // sorting
        System.out.print("\nAfter com.company.algorithms.sorting:  ");
        printArr(arr);

        System.out.print("\n\nFind number: ");               // input
        int x = in.nextInt();

        int result = binarySearch(arr, x);                   // searching
//        int result = binarySearch(arr, 0, arr.length, x);    // searching
        System.out.println(x + " index of: " + result);
    }

    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int m = left + (right - left) / 2;

            if (arr[m] == x)
                return m;
            else if (arr[m] < x)
                left = m + 1;
            else
                right = m - 1;
        }

        return -1;
    }

    public static int binarySearch(int[] arr, int left, int right, int x) {
        while (left <= right) {
            int m = left + (right - left) / 2;

            if (arr[m] == x)
                return m;
            else if (arr[m] < x)
                left = m + 1;
            else
                right = m - 1;
        }

        return -1;
    }

    public static void printArr(int[] arr) {
        System.out.print("| ");

        for (int value : arr)
            System.out.print(value + " | ");
    }
}
