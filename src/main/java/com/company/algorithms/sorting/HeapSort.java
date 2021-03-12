package com.company.algorithms.sorting;

public class HeapSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 1, 9, 12, 6, 5};
        minHeapSort(arr);
        printArr(arr);
    }

    public static void minHeapSort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            minHeapify(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            minHeapify(arr, i, 0);
        }
    }

    static void minHeapify(int[] arr, int n, int i) {
        int largest = i;  // initialize largest as root
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than root
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            minHeapify(arr, n, largest);
        }
    }

    static void printArr(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
