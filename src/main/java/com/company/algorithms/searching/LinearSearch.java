package com.company.algorithms.searching;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test Linear Search
        int arr[] = new int[]{5, 3, 10, 0, 4};
        printArr(arr);

        System.out.print("\n\nFind number: ");
        int x = in.nextInt();
        int result = linearSearch(arr, x);

        System.out.println(x + " index of: " + result);
    }

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void printArr(int[] arr) {
        System.out.print("| ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }
}
