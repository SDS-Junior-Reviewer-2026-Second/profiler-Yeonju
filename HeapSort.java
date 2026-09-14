package org.example;

import java.util.ArrayList;

public class HeapSort implements SortLibrary {
    private int changeCnt = 0;

    @Override
    public void sort(ArrayList<Integer> arr) {
        changeCnt = 0;
        int n = arr.size();

        // 1. 최대 힙(Max Heap) 구성
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // 2. 힙에서 하나씩 꺼내면서 정렬
        for (int i = n - 1; i > 0; i--) {
            swap(arr, 0, i);      // 루트(최댓값)를 마지막으로 이동
            heapify(arr, i, 0);   // 남은 부분을 다시 힙 구조로 재정렬
        }
    }

    // 인덱스 i를 루트로 하는 서브트리를 최대 힙 구조로 재정렬
    private void heapify(ArrayList<Integer> arr, int size, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr.get(left) > arr.get(largest)) {
            largest = left;
        }
        if (right < size && arr.get(right) > arr.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, size, largest); // 교환된 자리 아래를 재귀적으로 재정렬
        }
    }

    private void swap(ArrayList<Integer> arr, int i, int j) {
        changeCnt++;
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    @Override
    public int getChangeCnt() {
        return changeCnt;
    }

    @Override
    public String getName() {
        return "HeapSort";
    }
}