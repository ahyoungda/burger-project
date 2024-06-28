package com.burgerland.controller;

import com.burgerland.common.OrderDTO;
import com.burgerland.service.OrderService;
import com.burgerland.view.OrderPrintResult;

import java.util.Map;

public class OrderController {
    private final OrderPrintResult orderPrintResult;
    private final OrderService orderService;

    public OrderController() {
        orderPrintResult = new OrderPrintResult();
        orderService = new OrderService();
    }

    public void registOrder(Map<String, String> parameter) {
        // 메뉴 이름 가져오기
        String menuName = parameter.get("menuName");
        if (menuName == null) {
            // 예외 처리 또는 오류 메시지 출력
            System.err.println("메뉴 이름이 없습니다.");
            return;
        }

        // 주문 고객 연락처 입력받기
        String custContact = parameter.get("custContact");
        String custName = parameter.get("custName");
        OrderDTO order = new OrderDTO();
        order.setMenuName(menuName);
        order.setCustomerContact(custContact);
        order.setCustomerName(custName);

        if (orderService.registOrder(order)) {
            orderPrintResult.printSuccessMessage("insert");
        } else {
            orderPrintResult.printErrorMessage("insert");
        }
    }

//    public void registOrder(Map<String, String> parameter) {
//        String menuName = parameter.get("menuName");
//        int custContact = Integer.parseInt(parameter.get("custContact"));
//
//        OrderDTO order = new OrderDTO();
//        order.setMenuName(menuName);
//        order.setCustomerContact(custContact);
//
//        if (orderService.registOrder(order)) {
//            orderPrintResult.printSuccessMessage("insert");
//        } else {
//            orderPrintResult.printErrorMessage("insert");
//        }
//    }
}

