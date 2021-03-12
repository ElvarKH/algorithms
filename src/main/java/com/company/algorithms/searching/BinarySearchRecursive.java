package com.company.algorithms.searching;


import com.company.algorithms.sorting.BubbleSort;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // CreateRandomWordsFromText Recursive Binary Search
        int[] arr = new int[]{5, 3, 10, 0, 4};           // unsorted
        System.out.print("Before com.company.algorithms.sorting: ");
        printArr(arr);

        BubbleSort.bubbleSort(arr);                      // sorting
        System.out.print("\nAfter com.company.algorithms.sorting:  ");
        printArr(arr);

        System.out.print("\n\nFind number: ");           // input
        int x = in.nextInt();

        int result = recursiveBinarySearch(arr, x);      // searching
//        int result = recursiveBinarySearch(arr, 0, arr.length, x);      // searching
        System.out.println(x + " index of: " + result);
    }

    public static int recursiveBinarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x)
                return mid;

            else if (arr[mid] < x)
                return recursiveBinarySearch(arr, mid + 1, right, x);

            return recursiveBinarySearch(arr, left, mid - 1, x);  // else
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int left, int right, int x) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x)
                return mid;

            else if (arr[mid] < x)
                return recursiveBinarySearch(arr, mid + 1, right, x);

            return recursiveBinarySearch(arr, left, mid - 1, x);  // else
        }

        return -1;
    }

    public static void printArr(int[] arr) {
        System.out.print("| ");

        for (int value : arr)
            System.out.print(value + " | ");
    }
}
