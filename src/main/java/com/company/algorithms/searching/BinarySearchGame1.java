package com.company.algorithms.searching;

import java.util.Scanner;

public class BinarySearchGame1 {
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 1000) + 1;
        game(rand);
    }

    public static void game(int x) {
        int result;
        int count = 0;

        while (true) {
            ++count;

            System.out.println("Guess the index: ");
            int index = new Scanner(System.in).nextInt();

            if (x == index) {
                result = index;
                System.err.println("Correct !");
                break;
            } else if (x > index) {
                System.err.println("Greater than \n");
            } else {
                System.err.println("Less than \n");
            }
        }

        System.out.println("\nCorrect index is: " + result);
        System.out.println("Trying: " + count);
    }
}
