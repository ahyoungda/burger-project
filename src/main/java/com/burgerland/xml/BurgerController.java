package com.burgerland.xml;

import com.burgerland.common.MenuDTO;

import java.util.Scanner;

public class BurgerController {

    public void burgerOrder() {
    }

    public void burgerMenu() {

        Scanner sc = new Scanner(System.in);

        BurgerService burgerService = new BurgerService();

        do {

            System.out.println("버거랜드 메뉴 시스템");
            System.out.println("1. 전체 메뉴 조회");
            System.out.println("2. 신규 메뉴 등록");
            System.out.println("3. 메뉴 변경");
            System.out.println("4. 메뉴 삭제");
            System.out.println("해당하는 번호를 선택해주세요");
            int num = sc.nextInt();

            switch (num) {

                case 1: burgerService.viewMenu(); break;
                case 2: burgerService.insertMenu(inputmenu()); break;
                case 3: burgerService.updateMenu(); break;
                case 4: burgerService.deleteMenu(); break;

            }
        } while (true);


    }

    private MenuDTO inputmenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("동록할 메뉴 이름을 입력하세요");
        String name = sc.nextLine();
        System.out.println("메뉴의 가격을 입력하세요");
        int price = sc.nextInt();
        System.out.println("등록할 카테고리를 입력하세요");
        sc.nextLine();
        String category = sc.nextLine();

        MenuDTO menu = new MenuDTO();
        menu.setMenuName(name);
        menu.setMenuPrice(price);
        menu.setCategory(category);

        return menu;


    }

    public void burgerCustomer() {
    }
}
