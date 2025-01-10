package com.example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> results;

    public Calculator() {
        this.results = new ArrayList<>(); // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    }

    // 사칙연산 수행 메서드
    public int calculate(int firstNo, int secondNo, char fbo) {
        int result = switch (fbo) {
            case '+' -> firstNo + secondNo;
            case '-' -> firstNo - secondNo;
            case '*' -> firstNo * secondNo;
            case '/' -> firstNo / secondNo;
            default -> 0;
        };

        addResult(result);
        return result;
    }

    // Getter 메서드 - 캡슐화
    public List<Integer> getResults() { // 계산 결과를 저장
        return new ArrayList<>(results);
    }

    // Setter 메서드 - 캡슐화
    public void setResults(List<Integer> newResults) {
        this.results = new ArrayList<>(newResults);
    }

    public void addResult(int result) {
        results.add(result);
    }

    public void deleteFirstSave() {
        if (!results.isEmpty()) {
            results.remove(0); // 첫 세이브값 삭제
        }
    }
}
