package com.burgerland.controller;

import com.burgerland.common.MenuDTO;
import com.burgerland.service.MenuService;
import com.burgerland.view.MenuPrintResult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MenuController {

   private final MenuService menuService;
   private final MenuPrintResult menuPrintResult;


    public MenuController() {
        menuPrintResult = new MenuPrintResult();
        menuService = new MenuService();

    }

    public void viewMenu() {


        List<MenuDTO> menuList = menuService.viewMenu();

        menuPrintResult.printMenuList(menuList);


    }

    public static Map<String, String> inputMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("동록할 메뉴 이름을 입력하세요");
        String menuName = sc.nextLine();
        System.out.println("메뉴의 가격을 입력하세요");
        int menuPrice = sc.nextInt();
        System.out.println("등록할 카테고리를 입력하세요");
        sc.nextLine();
        String category = sc.nextLine();

        Map<String, String> Object = new HashMap<>();
        Object.put("menuName", menuName);
        Object.put("menuPrice", String.valueOf(menuPrice));
        Object.put("category", category);
        return Object;




    }


    public void insertMenu (Map<String, String> Object) {


        MenuDTO menu = new MenuDTO();

        String menuName = Object.get("menuName");
        String menuPrice = Object.get("menuPrice");
        String category = Object.get("category");

//        MenuDTO menu = new MenuDTO();
        menu.setMenuName(menuName);
        menu.setMenuPrice(Integer.parseInt(menuPrice));
        menu.setCategory(category);



        if (menuService.insertMenu(menu)) {
            menuPrintResult.printSuccessMessage("insert");
        } else {
            menuPrintResult.printErrorMessage("insert");
        }



    }

    public void updateMenu(Map<String, String> menuMap) {


        if (menuService.updateMenu(menuMap)) {
            menuPrintResult.printSuccessMessage("update");
        } else {
            menuPrintResult.printErrorMessage("update");
        }


    }

    public static Map<String, String> modifyMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 메뉴의 코드를 입력하세요");
        int menuCode = sc.nextInt();
        System.out.println("수정할 메뉴 이름을 입력하세요");
        sc.nextLine();
        String menuName = sc.nextLine();
        System.out.println("수정할 메뉴의 가격을 입력하세요");
        int menuPrice = sc.nextInt();
        System.out.println("등록할 카테고리를 입력하세요");
        sc.nextLine();
        String category = sc.nextLine();

        Map<String, String> menuMap = new HashMap<>();
        menuMap.put("menuCode", String.valueOf(menuCode));
        menuMap.put("menuName", menuName);
        menuMap.put("menuPrice", String.valueOf(menuPrice));
        menuMap.put("category", category);
        return menuMap;

    }

    public void deleteMenu(Map<String, String> Object) {

        MenuDTO menu = new MenuDTO();

        int menuCode = Integer.parseInt(Object.get("menuCode"));

        menu.setMenuCode(Integer.parseInt(String.valueOf(menuCode)));

//        Stirng menuCode = Integer.parseInt(Object.get("menuCode"));


        if (menuService.deleteMenu(menuCode)) {
            menuPrintResult.printSuccessMessage("delete");
        } else {
            menuPrintResult.printErrorMessage("delete");
        }


    }

    public static Map<String, String> noMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 메뉴 코드를 입력하세요");
        String menuCode = sc.nextLine();

        Map<String, String> Object = new HashMap<>();
        Object.put("menuCode", menuCode);
        return Object;




    }



}
