package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static List<Integer> getPositiveNumber (List<Integer> arrayList){
        Iterator<Integer> itr = arrayList.iterator();
        while(itr.hasNext()) {
            int num = itr.next();
            if (num < 0)
                itr.remove();
        }
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        return arrayList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(0);
        list.add(-12);
        list.add(123);
        list.add(0);
        list.add(-24);
        list.add(12);
        list.add(32);
        list.add(-43);
        list.add(1);
        list.add(-3);
        System.out.print(list);
        System.out.println();
        list = Main.getPositiveNumber(list);
        System.out.print(list + " ");
    }
}
