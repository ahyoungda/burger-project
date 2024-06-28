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
    // 2. 메뉴의 이름을 선택한다.
    // 3. 주문 개수와 가격의 최종 합산을 한다.
    // 4. 최종 출력은
    // {주문 번호}, {메뉴 이름}, {메뉴 가격}, {메뉴별 주문 개수}, {주문일}
    // 내용이 담긴 영수증이 출력된다.
    public void registOrder(String menuName) {
        String menuName = parameter.get("menuName");

    }
}

