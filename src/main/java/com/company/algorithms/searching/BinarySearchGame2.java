package com.company.algorithms.searching;

import java.util.Scanner;

public class BinarySearchGame2 {
    public static void main(String[] args) {
        System.out.print("Enter the number you are looking for: ");
        game(new Scanner(System.in).nextInt());
    }

    public static void game(int x) {
        int i = 0;
        int j = 1000000;
        int result;
        int count = 0;


        while (true) {
            ++count;
            int m = (i + j) / 2;

            if (m == x) {
                result = x;
                System.out.println("Correct !");
                break;
            } else if (x > m) {
                i = m - 1;
                System.out.println("Greater than " + m + "\n");
            } else {
                j = m + 1;
                System.out.println("Less than " + m + "\n");
            }
        }

        System.out.println("\nCorrect index is: " + result);
        System.out.println("Trying: " + count);
    }
}
