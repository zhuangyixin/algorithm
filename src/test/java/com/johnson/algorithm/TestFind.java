package com.johnson.algorithm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

public class TestFind {

    public boolean Find(int target, int[][] array) {
        int a = array.length;
        for (int i = 0; i < a; i++) {
            int b = array[i].length;
            for (int j = 0; j < b; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        sb.replace(0, sb.length(), " ");
        return false;
    }

    public String replaceSpace(StringBuffer str) {
        while (str.indexOf(" ") != -1) {
            int i = str.indexOf(" ");
            str.replace(i, i + 1, "%20");
        }
        return str.toString();
    }

    public class Solution {
        public class ListNode {
            int val;
            ListNode next = null;

            ListNode(int val) {
                this.val = val;
            }
        }

        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList list = new ArrayList();
            Stack stack = new Stack();
            while (listNode != null) {
                stack.push(listNode.val);
                listNode = listNode.next;
            }
            while (!stack.empty()) {
                list.add(stack.pop());
            }
            return list;
        }
    }

    @Test
    public void testReplaceSpace() {
        System.out.println(replaceSpace(new StringBuffer("     ")));
    }
}
