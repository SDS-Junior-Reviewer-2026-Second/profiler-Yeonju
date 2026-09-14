package org.example;

import java.util.ArrayList;

public class BubbleSort implements SortLibrary {
    private int changeCnt = 0;

    @Override
    public void sort(ArrayList<Integer> arr) {
        changeCnt = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = 0; j < arr.size() - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    changeCnt++;
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    @Override
    public int getChangeCnt() {
        return changeCnt;
    }

    @Override
    public String getName() {
        return "BubbleSort";
    }
}