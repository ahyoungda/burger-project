package com.burgerland.xml;

import com.burgerland.controller.MenuController;
import com.burgerland.view.CustomerPrintResult;
import com.burgerland.view.MenuPrintResult;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MenuController burgerController = new MenuController();
        MenuPrintResult menuPrintResult = new MenuPrintResult();
        CustomerPrintResult customerPrintResult = new CustomerPrintResult();

        do {
            System.out.println("============= 버거랜드 시스템 =============");
            System.out.println("버거랜드 시스템");
            System.out.println("1. 주문");
            System.out.println("2. 메뉴 관리");
            System.out.println("3. 고객 관리");
            System.out.println("0. 프로그램 종료");
            System.out.print("해당하는 번호를 입력하세요: ");
            int num = sc.nextInt();

            switch (num) {

                case 1:
                    burgerController.burgerOrder();
                    break;
                case 2:
                    menuPrintResult.burgerMenu();
                    break;
                case 3:
                    customerPrintResult.burgerCustomer();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력했습니다.");
                    break;
            }

        } while (true);
    }


}