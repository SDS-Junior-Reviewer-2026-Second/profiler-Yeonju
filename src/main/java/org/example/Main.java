package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // TODO : Profiler 실행해보기

        Profiler profiler = new Profiler();

        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 2, 4, 1, 3, 9));
        profiler.setData(input);
        profiler.setLib(new BubbleSort());
        profiler.runLib();
        profiler.showResult();

        // HeapSort도 같은 방식으로 이어서 평가 가능
        profiler.setLib(new HeapSort());
        profiler.runLib();
        profiler.showResult();
    }
}
