package com.burgerland.view;

import com.burgerland.controller.MenuController;
import com.burgerland.controller.OrderController;
import com.burgerland.service.MenuService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderPrintResult {

    // 고객주문 관리 시스템
    public static void burgerOrder() {
        Scanner sc = new Scanner(System.in);
        OrderController orderController = new OrderController();
        MenuController menuController = new MenuController();

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
                    menuController.viewMenu();
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
        Scanner sc = new Scanner(System.in);
        Map<String, String> orderInfo = new HashMap<>();

        // 메뉴 이름 입력 받기
        System.out.print("구매할 메뉴 이름을 입력하세요: ");
        String menuName = sc.nextLine();



        orderInfo.put("menuName", menuName);

        // 연락처 입력 받기
        System.out.print("고객 연락처를 입력하세요: ");
        String custContact = sc.nextLine();
        orderInfo.put("custContact", custContact);

        // 주문 고객 이름 입력받기
        System.out.print("고객 성함을 입력하세요: ");
        String custName = sc.nextLine();
        orderInfo.put("custName", custName);

        return orderInfo;
    }

        public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "selectList":
                successMessage = "메뉴 목록 조회를 성공했습니다.";
                break;
            case "selectOne":
                successMessage = "메뉴 조회를 성공했습니다.";
                break;
            case "insert":
                successMessage = "신규 주문을 성공했습니다.";
                break;
            case "update":
                successMessage = "주문 수정을 성공했습니다.";
                break;
            case "delete":
                successMessage = "주문 취소를 성공했습니다.";
                break;
        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "selectList":
                errorMessage = "메뉴 목록 조회를 실패했습니다.";
                break;
            case "selectOne":
                errorMessage = "메뉴 조회를 실패했습니다.";
                break;
            case "insert":
                errorMessage = "신규 주문을 실패했습니다.";
                break;
            case "update":
                errorMessage = "주문 수정을 실패했습니다.";
                break;
            case "delete":
                errorMessage = "주문 취소를 실패했습니다.";
                break;
        }
        System.out.println(errorMessage);
    }
}
