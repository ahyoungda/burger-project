package com.burgerland.controller;

import com.burgerland.common.OrderDTO;
import com.burgerland.service.OrderService;
import com.burgerland.view.OrderPrintResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OrderController {
    private final OrderPrintResult orderPrintResult;
    private final OrderService orderService;

    public OrderController() {
        orderPrintResult = new OrderPrintResult();
        orderService = new OrderService();
    }

    public void registOrder(String s) {




    }

    public void showMyOrder() {



        List<OrderDTO> orderList = orderService.showMyOrder();

        orderPrintResult.printOrderList(orderList);


    }

    public void cancelMyOrder(Map<String, String> Object) {

        OrderDTO order = new OrderDTO();

        int orderCode = Integer.parseInt(Object.get("orderCode"));

        order.setOrderCode(Integer.parseInt(String.valueOf(orderCode)));

//        Stirng orderCode = Integer.parseInt(Object.get("orderCode"));


        if (orderService.cancelMyOrder(orderCode)) {
            orderPrintResult.printSuccessMessage("delete");
        } else {
            orderPrintResult.printErrorMessage("delete");
        }



    }


    public static Map<String, String> deleteOrder() {

        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 메뉴 코드를 입력하세요");
        String orderCode = sc.nextLine();

        Map<String, String> Object = new HashMap<>();
        Object.put("orderCode", orderCode);
        return Object;




    }


    // 구현 예정 : 주문 과정
    // 1. 메뉴 목록을 조회한다.
    // 2. 메뉴의 이름을 선택한다.
    // 3. 주문 개수와 가격의 최종 합산을 한다.
    // 4. 최종 출력은
    // {주문 번호}, {메뉴 이름}, {메뉴 가격}, {메뉴별 주문 개수}, {주문일}
    // 내용이 담긴 영수증이 출력된다.
//    public void registOrder(Map<String, String> parameter) {
//        String menuName = parameter.get("menuName");
//        int custContact = Integer.parseInt(parameter.get("custContact"));
//
//        OrderDTO order = new OrderDTO();
//        order.setOrderName(menuName);
//        order.setOrderContact(custContact);
//
//        if (orderService.registOrder(order)) {
//            orderPrintResult.printSuccessMessage("order")
//        }
//
//    }
}

