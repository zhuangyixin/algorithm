package com.johnson.algorithm.hanoi;

public class Hanoi {
    private int size;
    private String originalColumn;
    private String destinationColumn;
    private String transitColumn;

    public Hanoi(int size, String originalColumn, String destinationColumn, String transitColumn) {
        this.size = size;
        this.originalColumn = originalColumn;
        this.destinationColumn = destinationColumn;
        this.transitColumn = transitColumn;
    }

    public void start() {
        move(this.size, this.originalColumn, this.destinationColumn, this.transitColumn);
    }

    public void move(int n, String from, String to, String transit) {
        if (n == 0) {
            return;
        }
        move(n - 1, from, transit, to);
        printMove(n, from, to);
        move(n - 1, transit, to, from);
    }

    public void printMove(int dishNo, String from, String to) {
        System.out.println(String.format("Move dish No.%d from %s to %s.", dishNo, from, to));
    }
}
