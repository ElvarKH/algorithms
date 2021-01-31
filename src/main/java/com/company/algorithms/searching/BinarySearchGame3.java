package com.company.algorithms.searching;

import java.util.Scanner;

public class BinarySearchGame3 {
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 5;
        }
        System.out.print("Enter the number you are looking for: ");
        game(arr, new Scanner(System.in).nextInt(3));
    }

    public static void game(int[] arr, int x) {
        int i = 0;
        int j = arr.length - 1;
        int result = -1;
        int count = 0;


        if (x % 5 == 0 && x > 0 && x < arr[arr.length - 1])
            while (i - j != 1) {
                ++count;
                int m = (i + j) / 2;

                if (arr[m] == x) {
                    result = m;
                    System.out.println("Correct !");
                    break;
                } else if (arr[m] < x) {
                    i = m - 1;
                    System.out.println("Greater than " + arr[m] + "\n");
                } else {
                    j = m + 1;
                    System.out.println("Less than " + arr[m] + "\n");
                }
                System.out.println("i = " + i);
                System.out.println("j = " + j);
            }

        if (result != -1)
            System.out.println("\nCorrect index is: " + result + "\nTrying: " + count);
        else
            System.out.println("Number is not found");

    }
}
