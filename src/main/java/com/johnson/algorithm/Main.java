package com.johnson.algorithm;

import java.util.*;

public class Main {
    //
    public static int get(char numText) {
        int code = (int) numText;
        if (code > 64 && code < 91) {
            return code - 65 + 10;
        } else return Integer.valueOf(String.valueOf(numText));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {


            String origin = scanner.nextLine();
            char[] text = origin.toCharArray();
            int result = 0;
            int base = 1;
            for (int i = text.length - 1; i > 1; i--) {
                int code = (int) text[i];
                if (code > 64 && code < 91) {
                    code =  code - 65 + 10;
                } else {
                    code = Integer.valueOf(String.valueOf(code));
                }
                result += get(text[i]) * base;
                base *= 16;
            }
            System.out.println(result);
        }
    }
}
