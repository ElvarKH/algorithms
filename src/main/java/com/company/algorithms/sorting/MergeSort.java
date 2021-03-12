package com.company.algorithms.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 1, 9, 12, 6, 5};
        mergeSort(arr);
        printArr(arr);
    }

    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int i = 0, first = start, last = mid + 1;
        int[] tmp = new int[end - start + 1];

        while (first <= mid && last <= end)
            tmp[i++] = arr[first] < arr[last] ? arr[first++] : arr[last++];

        while (first <= mid)
            tmp[i++] = arr[first++];

        while (last <= end)
            tmp[i++] = arr[last++];

        i = 0;
        while (start <= end)
            arr[start++] = tmp[i++];
    }

    static void printArr(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
