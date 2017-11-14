package com.codecool.tinkerTailor;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TinkerTailor {
    private List<Integer> n = new LinkedList<>(); // array of ppl(numbers)
    private int k; // magic number

    public TinkerTailor(){
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Collections.addAll(n, array);
        k = 8;
    }

    public TinkerTailor(List<Integer> list, int k){
        this.k = k;
        n.addAll(list);
    }


    public void game() {
        int index= 0;
        if (n.size() == 1){
            System.out.format("%d wins\n", n.get(0));
            return;
        }
        while (k < n.size()) {
            if ((index + k) >= n.size()){
                index = ((index + k) % n.size()) - 1;
            } else {
                index += k - 1;
            }
            if (index < 0){
                index = 0;
            }
            System.out.format("%d is out\n", n.get(index));
            n.remove(index);
            index -= 1;
        }
        while (n.size() != 1) {
            index = ((index + k) % n.size()) - 1;
            if (index < 0){
                index = 0;
            }
            System.out.format("%d is out\n", n.get(index));
            n.remove(index);
            index -= 1;
        }
        System.out.format("%d wins\n", n.get(0));
    }
}
