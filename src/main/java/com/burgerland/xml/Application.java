package com.burgerland.xml;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintResult printResult = new PrintResult();

        do {
            System.out.println("============= 버거랜드 시스템 =============");
            System.out.println("1. 주문");
            System.out.println("2. 메뉴 관리");
            System.out.println("3. 고객 관리");
            System.out.print("해당하는 번호를 입력하세요: ");
            int num1 = sc.nextInt();

            switch (num1) {

                case 1:
//                    burgerOrder();
//                    break;
                case 2:
//                    burgerMenu();
//                    break;
                case 3:
                    printResult.burgerCustomer();
                    break;
            }
        } while (true);
    }

//    private static void burgerOrder() {
//
//    }
//
//    private static void burgerMenu() {
//
//    }




}
