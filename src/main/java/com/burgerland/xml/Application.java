package com.burgerland.xml;

import com.burgerland.common.MenuDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BurgerController burgerController = new BurgerController();

        do {

            System.out.println("버거랜드 시스템");
            System.out.println("1. 주문");
            System.out.println("2. 메뉴 관리");
            System.out.println("3. 고객 관리");
            System.out.println("해당하는 번호를 입력하세요");
            int num = sc.nextInt();

            switch (num) {

                case 1:
                    burgerController.burgerOrder();
                    break;
                case 2:
                    burgerController.burgerMenu();
                    break;
                case 3:
                    burgerController.burgerCustomer();
                    break;


            }

        } while (true);


    }
}

