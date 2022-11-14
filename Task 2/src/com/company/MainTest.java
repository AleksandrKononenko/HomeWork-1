package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MainTest {
    private Assertions Assert;
    @Test
    void testFoo() {
        Map<String, Long> actual = new HashMap<String, Long>();
        actual.put("#meet", 4L);
        actual.put("#people", 3L);
        actual.put("#music", 2L);
        actual.put("#man", 2L);
        actual.put("#woman", 1L);

        List<String> list = new ArrayList<>();
        list.add("#people");
        list.add("#music");
        list.add("#meet");
        list.add("#people");
        list.add("#man");
        list.add("#meet");
        list.add("#street");
        list.add("#man");
        list.add("#meet");
        list.add("#people");
        list.add("#music");
        list.add("#woman");
        list.add("#meet");

        Map<String, Long> expected = Main.foo(list);
        Assert.assertEquals(expected, actual);
    }
}