package com.johnson.algorithm.queen;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    private List<Integer> board;
    private int queensNum;
    private int resultNum;

    public Queue(int queensNum) {
        this.queensNum = queensNum;
        this.board = new LinkedList<Integer>();
    }

    public void insert(int row) {
        // close if reach the last row
        if (row == this.queensNum) {
            print();
            this.resultNum++;
            return;
        }
        // try to insert all column of this row
        for (int i = 0; i < this.queensNum; i++) {
            if (isValid(board, row, i)) {
                board.add(row, i);
                insert( row + 1);
            }
        }
    }

    public void print() {
        System.out.println("-------------------------");
        for (int i = 0; i < this.queensNum; i++) {
            System.out.print("|");
            for (int j = 0; j < this.queensNum; j++) {
                if (board.get(i) != j) {
                    System.out.print(" o |");
                } else {
                    System.out.print(" x |");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------");
    }

    public boolean isValid(List<Integer> board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board.get(i).equals(col)) {
                return false;
            }
            if (Math.abs(i - row) == Math.abs(col - board.get(i))) {
                return false;
            }
        }
        return true;
    }
}
