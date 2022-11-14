package com.company;

import org.junit.jupiter.api.Assertions;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Assertions Assert;

    @org.junit.jupiter.api.Test
    void getVolume() {
        String expected = "Figure: ball3, volume: 3741,69\n" +
                "Figure: cube2, volume: 571,79\n" +
                "Figure: ball1, volume: 416,74\n" +
                "Figure: cylinder2, volume: 192,48\n" +
                "Figure: ball2, volume: 186,36\n" +
                "Figure: cylinder1, volume: 121,54\n" +
                "Figure: cube1, volume: 91,13\n" +
                "Figure: cube3, volume: 10,65\n";

        Figure cube1 = new Figure(4.5, "cube");
        Figure cube2 = new Figure(8.3, "cube");
        Figure cube3 = new Figure(2.2, "cube");
        Figure ball1 = new Figure(5.1, "ball");
        Figure ball2 = new Figure(3.9, "ball");
        Figure ball3 = new Figure(10.6, "ball");
        Figure cylinder1 = new Figure(2.9, 4.6);
        Figure cylinder2 = new Figure(3.4, 5.3);

        Map<String, Figure> collection = new HashMap<String, Figure>();
        collection.put("cube1", cube1);
        collection.put("cube2", cube2);
        collection.put("cube3", cube3);
        collection.put("ball1", ball1);
        collection.put("ball2", ball2);
        collection.put("ball3", ball3);
        collection.put("cylinder1", cylinder1);
        collection.put("cylinder2", cylinder2);

        Assert.assertEquals(expected, Main.getVolume(collection));
    }
}