package org.example;

import java.util.ArrayList;

public class Profiler {
    private ArrayList<Integer> originalData;
    private ArrayList<Integer> resultData;
    private SortLibrary lib;

    public void setData(ArrayList<Integer> data) {
        this.originalData = data;
    }

    public void setLib(SortLibrary lib) {
        this.lib = lib;
    }

    public void runLib() {
        if (originalData == null) {
            throw new IllegalStateException("setData()로 데이터를 먼저 설정해주세요.");
        }
        if (lib == null) {
            throw new IllegalStateException("setLib()으로 라이브러리를 먼저 설정해주세요.");
        }
        resultData = new ArrayList<>(originalData);
        lib.sort(resultData);
    }

    public void showResult() {
        if (resultData == null) {
            throw new IllegalStateException("runLib()을 먼저 실행해주세요.");
        }
        System.out.println("[" + lib.getName() + "] 정렬 결과 : " + resultData);
        System.out.println("[" + lib.getName() + "] Swap 횟수 : " + lib.getChangeCnt());
    }
}
