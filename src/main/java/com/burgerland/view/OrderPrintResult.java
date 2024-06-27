package com.burgerland.view;

import com.burgerland.controller.OrderController;
import com.burgerland.service.MenuService;

import java.util.Map;
import java.util.Scanner;

public class OrderPrintResult {

    // 고객주문 관리 시스템
    public static void burgerOrder() {
        Scanner sc = new Scanner(System.in);
        OrderController orderController = new OrderController();
        MenuService menuService = new MenuService();

        do {
            System.out.println("============= 버거랜드 고객주문 시스템 =============");
            System.out.println("1. 메뉴보기");
            System.out.println("2. 주문하기");
            System.out.println("3. 주문조회");
            System.out.println("4. 주문취소");
            System.out.println("0. 집에가기");
            System.out.println("선택할 번호를 입력하세요: ");
            int num = sc.nextInt();
            sc.nextLine();

            switch (num) {
                case 1:
                    menuService.viewMenu();
//                    System.out.println("메뉴보기 출력 테스트");
                    break;
                case 2:
                    orderController.registOrder(inputOrderInfo());
                    break;
                case 3:
//                    orderController.showMyOrder();
                    break;
                case 4:
//                    orderController.cancelMyOrder();
                    break;
                case 0:
                    System.out.println("안녕히 가십시오.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택했습니다.");
                    break;
            }
        } while (true);
    }

    private static Map<String, String> inputOrderInfo() {

        return null;
    }
}
