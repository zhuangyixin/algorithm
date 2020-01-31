package com.johnson.algorithm.sort;

public abstract class Sort {
    protected int[] array;

    public Sort(int[] array) {
        this.array = array;
    }

    public String formatArray() {
        StringBuilder builder = new StringBuilder();
        for (int i : this.array) {
            builder.append(i);
            builder.append(", ");
        }
        return builder.toString();
    }
}
