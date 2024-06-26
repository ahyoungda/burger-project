package com.burgerland.xml;

import com.burgerland.common.BurgerDTO;
import com.burgerland.common.CustomerDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BurgerController {
    private final PrintResult printResult;
    private final BurgerService burgerService;

    // 생성자
    public BurgerController() {
        printResult = new PrintResult();
        burgerService = new BurgerService();
    }

    // 고객정보 관리 시스템
    public void burgerCustomer() {
        Scanner sc = new Scanner(System.in);
        BurgerController burgerController = new BurgerController();

        do {
            System.out.println("============= 버거랜드 고객관리 시스템 =============");
            System.out.println("1. 고객정보 등록");
            System.out.println("2. 고객정보 조회");
            System.out.println("3. 고객정보 수정");
            System.out.println("4. 고객정보 삭제");
            System.out.println("0. 뒤로가기");
            System.out.print("선택할 번호를 입력하세요: ");
            int num = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            switch (num) {
                case 1:
                    registCustomer(inputCustInfo());
                    break;
                case 2:
                    showAllCustomer();
                    break;
                case 3:
                    modifyCustomer(inputModifyCust());
                    break;
                case 4:
                    deleteCustomer(inputCustCode());
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 선택했습니다.");
                    break;
            }
        } while (true);
    }

    // 고객 정보 삭제 메소드
    public void deleteCustomer(Map<String, String> parameter) {
        int custCode = Integer.parseInt(parameter.get("custCode"));

        if (burgerService.deleteCust(custCode)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }
    }

    // 고객 정보 삭제 - 번호 입력 메소드
    private static Map<String, String> inputCustCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 메뉴코드를 입력하세요: ");
        String custCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("custCode", custCode);

        return parameter;
    }

    // 고객 정보 수정 메소드
    private void modifyCustomer(Map<String, String> parameter) {

        int custCode = Integer.parseInt(parameter.get("custCode"));
        String custName = parameter.get("custName");
        String regDate = parameter.get("regDate");
        String custGrade = parameter.get("custGrade");


        CustomerDTO cust = new CustomerDTO();
        cust.setCustomerCode(custCode);
        cust.setCustomerName(custName);
        cust.setRegDate(regDate);
        cust.setCustomerGrade(custGrade);

//        System.out.println(cust.getRegDate()); // 테스트

        if (burgerService.modifyCustomer(cust)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    // 고객 정보 등록 메소드
    private void registCustomer(Map<String, String> parameter) {
        String custName = parameter.get("custName");
        String regDate = parameter.get("regDate");
        String custGrade = parameter.get("custGrade");

        CustomerDTO cust = new CustomerDTO();
        cust.setCustomerName(custName);
        cust.setRegDate(regDate);
        cust.setCustomerGrade(custGrade);

//        System.out.println(cust.getRegDate());

        if (burgerService.registCustomer(cust)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }


    // 전체 고객 조회 메소드
    public void showAllCustomer() {
        List<CustomerDTO> custList = burgerService.showAllCustomer();

//        System.out.println(custList); // 출력 테스트

        if (custList != null) {
            printResult.printCustList(custList);
        } else {
            printResult.printErrorMessage("selectList");
        }
    }

    // 고객 정보 등록 - 내용 기입 메소드
    private static Map<String, String> inputCustInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("추가할 고객 이름을 입력하세요.");
        String custName = sc.nextLine();
        System.out.println("추가할 고객의 가입일 입력하세요.(xxxx.xx.xx)");
        String regDate = sc.nextLine();
        System.out.println("추가할 고객의 계급을 입력하세요.(BRONZE, SILVER, GOLD, PLATINUM, DIAMOND)");
        String custGrade = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("custName", custName);
        parameter.put("regDate", regDate);
        parameter.put("custGrade", custGrade);
        return parameter;
    }

    // 고객 수정 등록 - 내용 기입 메소드
    private static Map<String, String> inputModifyCust() {
        Scanner sc = new Scanner(System.in);
        System.out.println("수정할 고객 코드를 입력하세요: ");
        String custCode = sc.nextLine();
        System.out.println("수정할 고객 이름을 입력하세요.");
        String custName = sc.nextLine();
        System.out.println("수정할 고객의 가입일 입력하세요.(xxxx.xx.xx)");
        String regDate = sc.nextLine();
        System.out.println("수정할 고객의 계급을 입력하세요.(BRONZE, SILVER, GOLD, PLATINUM, DIAMOND)");
        String custGrade = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("custCode", custCode);
        parameter.put("custName", custName);
        parameter.put("regDate", regDate);
        parameter.put("custGrade", custGrade);
        return parameter;
    }
}
