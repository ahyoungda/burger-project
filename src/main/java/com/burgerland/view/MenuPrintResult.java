package com.burgerland.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.burgerland.common.MenuDTO;
import com.burgerland.service.MenuService;

public class MenuPrintResult {
    public static void burgerMenu() {

        Scanner sc = new Scanner(System.in);

        MenuService menuService = new MenuService();

        do {

            System.out.println("============= 버거랜드 메뉴관리 시스템 =============");
            System.out.println("1. 전체 메뉴 조회");
            System.out.println("2. 신규 메뉴 등록");
            System.out.println("3. 메뉴 변경");
            System.out.println("4. 메뉴 삭제");
            System.out.println("해당하는 번호를 선택해주세요");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    menuService.viewMenu();
                    break;
                case 2:
                    menuService.insertMenu(inputMenu());
                    break;
                case 3:
                    menuService.updateMenu(updateMenu());
                    break;
                case 4:
                    menuService.deleteMenu(noMenu());
                    break;
            }
        } while (true);
    }

        private static Map<String, Object> noMenu() {


            Scanner sc = new Scanner(System.in);
            System.out.println("삭제할 메뉴 코드를 입력하세요");
            int code = sc.nextInt();


            Map<String, Object> menu = new HashMap<>();
            menu.put("menuCode", code);

            return menu;


        }

        private static Map<String, Object> updateMenu() {

            Scanner sc = new Scanner(System.in);
            System.out.println("수정할 메뉴 코드를 입력하세요");
            int code = sc.nextInt();
            System.out.println("수정된 메뉴명을 입력해주세요");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("수정된 가격을 입력해주세요");
            int price = sc.nextInt();
            System.out.println("수정된 카테고리를 입력해주세요");
            sc.nextLine();
            String category = sc.nextLine();

            Map<String, Object> menu = new HashMap<>();
            menu.put("menuCode", code);
            menu.put("menuName", name);
            menu.put("menuPrice", price);
            menu.put("category", category);

            return menu;


        }

        private static MenuDTO inputMenu() {

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
    }

