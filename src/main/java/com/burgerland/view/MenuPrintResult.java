package com.burgerland.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.burgerland.common.MenuDTO;
import com.burgerland.controller.MenuController;
import com.burgerland.xml.BurgerMapper;
import org.apache.ibatis.session.SqlSession;

import static com.burgerland.common.Template.getSqlSession;
import static com.burgerland.controller.MenuController.inputMenu;
import static com.burgerland.controller.MenuController.modifyMenu;
import static com.burgerland.controller.MenuController.noMenu;

public class MenuPrintResult {

    private BurgerMapper mapper;

    public static void burgerMenu() {

        Scanner sc = new Scanner(System.in);

        MenuController menuController = new MenuController();

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
                    menuController.viewMenu();
                    break;
                case 2:
                    menuController.insertMenu(inputMenu());
                    break;
                case 3:
                    menuController.updateMenu(modifyMenu());
                    break;
                case 4:
                    menuController.deleteMenu(noMenu());
                    break;
            }
        } while (true);
    }


    public void printMenuList(List<MenuDTO> menuList) {
        for (MenuDTO menu : menuList) {
            System.out.println(menu);
        }
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

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "insert":
                successMessage = "메뉴 등록을 성공했습니다.";
                break;
            case "update":
                successMessage = "메뉴 정보 수정을 성공했습니다.";
                break;
            case "delete":
                successMessage = "메뉴 정보 삭제를 성공했습니다.";
                break;
        }
        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "insert":
                errorMessage = "메뉴 등록을 실패했습니다.";
                break;
            case "update":
                errorMessage = "메뉴 수정에 실패했습니다.";
                break;
            case "delete":
                errorMessage = "메뉴 삭제에 실패했습니다.";
                break;
        }
        System.out.println(errorMessage);
    }


////        private static MenuDTO inputMenu() {
//
//            Scanner sc = new Scanner(System.in);
//            System.out.println("동록할 메뉴 이름을 입력하세요");
//            String name = sc.nextLine();
//            System.out.println("메뉴의 가격을 입력하세요");
//            int price = sc.nextInt();
//            System.out.println("등록할 카테고리를 입력하세요");
//            sc.nextLine();
//            String category = sc.nextLine();
//
//            MenuDTO menu = new MenuDTO();
//            menu.setMenuName(name);
//            menu.setMenuPrice(price);
//            menu.setCategory(category);
//
//            return menu;
//
//
//        }


    }

