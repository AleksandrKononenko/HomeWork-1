package com.company;
import java.lang.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static String getVolume(Map<String, Figure> collection) {
        String result = "";
        Comparator<Figure> byVolume = (Figure figureFirst, Figure figureSecond) -> Double.valueOf(figureSecond.getVolume()).compareTo(Double.valueOf(figureFirst.getVolume()));
        ;

        LinkedHashMap<String, Figure> sortedMap = collection.entrySet().stream()
                .sorted(Map.Entry.<String, Figure>comparingByValue(byVolume))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for( Map.Entry<String,Figure> entry : sortedMap.entrySet()){
            result += String.format("Figure: %s, volume: %.2f\n", entry.getKey(), entry.getValue().getVolume());
            System.out.printf("Figure: " + entry.getKey() + ", volume: %.2f\n", entry.getValue().getVolume());
        }
        return result;
    }

        public static void main(String args[]) {
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

            Main.getVolume(collection);
        }
    }


