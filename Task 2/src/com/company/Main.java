package com.company;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
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
        System.out.println(list);
        System.out.println(foo(list));
    }

    public static Map<String, Long> foo(List<String> list) {
        Pattern patt = Pattern.compile("(#\\w+)\\b");
        List<String> matStr = new ArrayList<>();
        list.stream().map(patt::matcher).forEach(match -> {
            while (match.find()) {
                matStr.add(match.group(1));
            }
        });

        Map<String, Long> rs = matStr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return rs
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .collect(Collectors.toMap(
                                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new
                        )
                );
    }
}
