package com.company.algorithms.mix;

public class TestArray {
    public static void main(String[] args) {

        int[][][][] arr = new int[][][][]{
                {
                        {
                                {
                                        0000, 0001, 0002
                                },
                                {
                                        0010, 0011, 0012
                                }
                        },
                        {
                                {
                                        0100, 0101, 0102
                                },
                                {
                                        0110, 0111, 0112
                                }
                        }
                },
                {
                        {
                                {
                                        1000, 1001, 1002
                                },
                                {
                                        1010, 1011, 1012
                                }
                        },
                        {
                                {
                                        1100, 1101, 1102
                                },
                                {
                                        1110, 1111, 1112
                                }
                        }
                }
        };

        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[0][0].length);
        System.out.println(arr[0][0][0].length);
    }
}
