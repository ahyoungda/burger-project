package com.burgerland.controller;

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

    // 구현 예정 : 주문 과정
    // 1. 메뉴 목록을 조회한다.
    // 2. 메뉴의 코드를 선택한다.
    // 3. 메뉴의 개수를 선택한다.
    // 4. 뒤로간다.
    // 5. 다른 메뉴를 추가한다.
    // 6. 주문 개수와 가격의 최종 합산을 한다.
    // 7. 최종 출력은 영수증이 출력된다.
    public void selectAllMenu() {
        
    }

    public void registOrder(Map<String, String> parameter) {

    }
}

