package com.codecool.tinkerTailor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Collections.addAll(list, array);

        List<Integer> list2 = new LinkedList<>();
        Integer[] array2 = {1, 2, 3, 4, 5};
        Collections.addAll(list2, array2);

        TinkerTailor tt1 = new TinkerTailor();
        TinkerTailor tt2 = new TinkerTailor(list, 8);
        TinkerTailor tt3 = new TinkerTailor(list2, 3);

        System.out.format("tt1\n");
        tt1.game();
        System.out.println("\n\ntt2");
        tt2.game();
        System.out.println("\n\ntt3");
        tt3.game();
    }
}
