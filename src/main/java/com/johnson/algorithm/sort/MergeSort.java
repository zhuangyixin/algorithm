package com.johnson.algorithm.sort;

public class MergeSort extends Sort {
    public MergeSort(int[] array) {
        super(array);
    }

    public void mergeSort(int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = (start + end) / 2;
        mergeSort(start, middle);
        mergeSort(middle + 1, end);
        sort(start, middle, end);
    }

    public void sort(int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        int[] temp = new int[end - start + 1];
        int k = 0;
        while (i <= middle && j <= end) {
            if (this.array[i] < this.array[j]) {
                temp[k++] = this.array[i++];
            } else {
                temp[k++] = this.array[j++];
            }
        }
        while (i <= middle) {
            temp[k++] = this.array[i++];
        }
        while (j <= end) {
            temp[k++] = this.array[j++];
        }
        k = 0;
        for (int w = start; w <= end; w++) {
            this.array[w] = temp[k++];
        }
    }

    public static final void main(String[] args) {
        MergeSort mergeSort = new MergeSort(new int[]{2, 7, 3, 98, 14, 4, 47, 5, 1});
        mergeSort.mergeSort(0, mergeSort.array.length - 1);
        System.out.println(mergeSort.formatArray());
    }
}
