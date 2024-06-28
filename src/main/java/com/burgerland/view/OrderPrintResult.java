package com.burgerland.view;

import com.burgerland.common.MenuDTO;
import com.burgerland.common.OrderDTO;
import com.burgerland.controller.OrderController;
import com.burgerland.service.MenuService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static com.burgerland.controller.OrderController.deleteOrder;

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
//                    orderController.registOrder(inputOrderInfo());
                    break;
                case 3:
                    orderController.showMyOrder();
                    break;
                case 4:
                    orderController.cancelMyOrder(deleteOrder());
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

    public void printOrderList(List<OrderDTO> orderList) {

        Map<String, Integer> orderMap = new HashMap<>();
        System.out.println("전화번호를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        int num = sc.nextInt();
        if (num == orderMap.get("customerContact")) {

            System.out.println(orderMap);

        } else {

            System.out.println("해당 주문이 없습니다");

        }



//        Map<String, Integer> orderMap = new HashMap<>();
//        orderMap.get(customerContact).equals(sc.nextInt());

//        System.out.println(orderMap);


//        if (orderMap.get("customerContact") == sc.nextInt()) {
//            for (OrderDTO order : orderList) {
//                System.out.println(order);
//            }
//        }
    }


    public void printSuccessMessage(String successCode) {

        String successMessage = "";
        switch (successCode) {
            case "delete":
                successMessage = "주문 취소를 성공했습니다.";
                break;
//            case "update":
//                successMessage = "주문 수정을 성공했습니다.";
//                break;
        }
        System.out.println(successMessage);

    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
//            case "update":
//                errorMessage = "주문 수정에 실패했습니다.";
//                break;
            case "delete":
                errorMessage = "주문 삭제에 실패했습니다.";
                break;
        }
        System.out.println(errorMessage);


    }
}

//    private static String inputOrderInfo() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("구매할 메뉴 이름을 입력하세요: ");
//        String menuName = sc.nextLine();
//
//        return menuName;
//    }

