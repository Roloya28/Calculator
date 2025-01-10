package com.example.calculator;

import java.util.Scanner;

public class CalculatorWithoutClass {
    public static void main(String[] args) {
        System.out.println("Hello, Calculator!");
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 첫번째 값 입력받기
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            // 두번째 값 입력받기
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            // 사칙연산 입력받기
            System.out.println("사칙연산 기호를 입력하세요: ");
            char fbo = sc.next().charAt(0);

            int result = 0;

            if (fbo == '+') {
                result = num1 + num2; // 더하기
            } else if (fbo == '-') {
                result = num1 - num2; // 빼기
            } else if (fbo == '*') {
                result = num1 * num2; // 곱하기
            } else if (fbo == '/') {
                result = num1 / num2; // 나누기
            } else {
                System.out.println("사칙연산 Error"); // 에러메세지
            }

            System.out.println("결과 : " + result);

            System.out.println("계산을 계속하시겠습니까? (exit 입력시 종료 or 아무키 입력으로 continue)");
            if (sc.next().equals("exit"))
                break;
        }
    }
}