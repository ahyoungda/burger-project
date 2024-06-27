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
    // 3. 메뉴의 개수를 선택한다. (보류)
    // 4. 뒤로간다.
    // 5. 다른 메뉴를 추가한다.
    // 6. 주문 개수와 가격의 최종 합산을 한다.
    // 7. 최종 출력은
    // {주문 번호}, {메뉴 이름}, {메뉴 가격}, {메뉴별 주문 개수}, {주문일}
    // 내용이 담긴 영수증이 출력된다.
    public void registOrder(Map<String, String> parameter) {
        // 메뉴 코드 선택
        String menuCode = parameter.get("menuCode");

        // 메뉴 개수 선택
//        String quantityStr = parameter.get("quantity");
//        int quantity = Integer.parseInt(quantityStr); // 문자열을 정수형으로 변환
        // 주문한 메뉴의 개수를 받아온다

        // 주문 번호 생성
        // 주문 번호를 생성하는 로직을 구현 (예: 시퀀스, 랜덤 문자열 등)
//        String orderNumber = generateOrderNumber(); // 예시 함수

        // 주문 정보 저장
        // 현재 시간을 기준으로 주문일을 생성
//        String orderDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    }
}

