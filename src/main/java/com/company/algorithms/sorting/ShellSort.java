package com.company.algorithms.sorting;

public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 1, 9, 12, 6, 5};
        shellSort(arr);
        printArr(arr);
    }

    static void shellSort(int[] arr) {
        int size = arr.length;
        int gap = size / 2;
        int tmp;

        while (gap > 0) {
            for (int j = gap; j < size; j++) {
                for (int k = j - gap; k >= 0; k -= gap) {
                    if (arr[k + gap] >= arr[k])
                        break;
                    else {
                        tmp = arr[k];
                        arr[k] = arr[k + gap];
                        arr[k + gap] = tmp;
                    }
                }
            }

            gap /= 2;
        }
    }

    public static void printArr(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
