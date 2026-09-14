package org.example;

import java.util.ArrayList;

// 모든 Sort 라이브러리가 구현해야 하는 공통 인터페이스
public interface SortLibrary {

    // 정렬 수행
    void sort(ArrayList<Integer> arr);

    // 정렬 과정에서 발생한 Swap(교환) 횟수 반환
    int getChangeCnt();

    // 결과 출력 시 구분하기 위한 라이브러리 이름
    String getName();
}