package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MainTest {
    private Assertions Assert;
    @Test
    void testGetPositiveNumber() {
        List<Integer> actual = new ArrayList<>();
        actual.add(123);
        actual.add(32);
        actual.add(12);
        actual.add(1);
        actual.add(0);

        List<Integer> list = new ArrayList<>();
        list.add(-12);
        list.add(123);
        list.add(0);
        list.add(-24);
        list.add(12);
        list.add(32);
        list.add(-43);
        list.add(1);
        list.add(-3);

        List<Integer> expected = Main.getPositiveNumber(list);
        Assert.assertEquals(expected, actual);
    }
}