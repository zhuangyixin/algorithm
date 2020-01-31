package com.johnson.algorithm.hanoi;

import org.junit.Test;

public class TestHanoi {

    @Test
    public void testHanoi() {
        Hanoi hanoi = new Hanoi(3, "A", "B", "C");
        hanoi.start();
    }
}
