package com.burgerland.xml;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BurgerService burgerService = new BurgerService();

        do {

            System.out.println("버거랜드 시스템");
            System.out.println("1. 주문");
            System.out.println("2. 메뉴 관리");
            System.out.println("3. 고객 관리");
            System.out.println("해당하는 번호를 입력하세요");
            int num = sc.nextInt();

            switch (num) {

                case 1:
                    burgerOrder(); break;
                case 2:
                    burgerMenu(); break;
                case 3:
                    burgerCustomer(); break;


            }

        } while (true);


    }

    private static void burgerOrder() {

    }

    private static void burgerMenu() {


        Scanner sc = new Scanner(System.in);

        BurgerService burgerService = new BurgerService();

        do {

            System.out.println("버거랜드 메뉴 시스템");
            System.out.println("1. 전체 메뉴 조회");
            System.out.println("2. 신규 메뉴 등록");
            System.out.println("3. 메뉴 변경");
            System.out.println("4. 메뉴 삭제");
            System.out.println("해당하는 번호를 선택해주세요");
            int num = sc.nextInt();

            switch (num) {

                case 1: burgerService.viewMenu(); break;
                case 2: burgerService.insertMenu(); break;
                case 3: burgerService.updateMenu(); break;
                case 4: burgerService.deleteMenu(); break;

            }
        } while (true);



    }

    private static void burgerCustomer() {
    }
}
