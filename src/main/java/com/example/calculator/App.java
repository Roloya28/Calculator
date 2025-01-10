package com.example.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator(); // Calculator 인스턴스 생성

        while (true) {
            // 첫번째 값 입력받기
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int firstNo = sc.nextInt();
            // 사칙연산 입력받기
            System.out.println("연산자를 입력하세요: [+,-,*,/]");
            char fbo = sc.next().charAt(0);
            // 두번째 값 입력받기
            System.out.println("두 번째 숫자를 입력하세요: ");
            int secondNo = sc.nextInt();

            // 결과값 출력
            int result = calculator.calculate(firstNo, secondNo, fbo);
            System.out.println("결과: " + firstNo + " " + fbo + " " + secondNo + " = " + result);

            // 결과값 저장, 현재 저장된 값 출력 및 삭제 여부 출력
            System.out.println("현재 저장된 결과 : " + calculator.getResults().size() + " " + calculator.getResults());

            System.out.println("가장 먼저 저장한 값을 삭제 하시겠습니까? (delete 입력시 삭제 or 아무키 입력으로 continue)");
            String delete = sc.next();
            if (delete.equalsIgnoreCase("delete")) { // equalIgnoreCase = 대소문자 구분없이 입력값 인식
                if (!calculator.getResults().isEmpty()) {
                    calculator.deleteFirstSave(); // 첫 세이브값 삭제
                    System.out.println("삭제 완료."); //
                }
            }

            System.out.println("계속 계산하시겠습니까? (exit 입력시 종료 or 아무키 입력으로 continue)");
            String exit = sc.next();
            if (exit.equalsIgnoreCase("exit")) {
                break;
            }
        }
        // 종료시 마지막 저장된 값 차례대로 출력
        System.out.println("최종 저장 결과: ");
        for (int res : calculator.getResults()) {
            System.out.println(res);
        }
        sc.close();
    }
}