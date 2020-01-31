package com.johnson.algorithm.sort;

import java.util.ArrayList;

public class QuickSort extends Sort {

    public QuickSort(int[] array) {
        super(array);
    }

    public int quickSort(int start, int end) {
        int temp = this.array[start];

        while (start < end) {
            while (start < end && this.array[end] > temp) {
                end--;
            }
            if (start < end) {
                this.array[start] = this.array[end];
                start++;
            }
            while (start < end && this.array[start] < temp) {
                start++;
            }
            if (start < end) {
                this.array[end] = this.array[start];
                end--;
            }
        }
        this.array[start] = temp;
        return start;
    }

    public void sort(int start, int end) {
        if (start >= end) {
            return;
        }
        int index = quickSort(start, end);
        sort(start, index);
        sort(index + 1, end);
    }

    public static final void main(String[] args) {
        QuickSort quickSort = new QuickSort(new int[]{2, 7, 3, 98, 14, 4, 47, 5, 1});
        quickSort.sort(0, quickSort.array.length - 1);
        System.out.println(quickSort.formatArray());
    }
}
