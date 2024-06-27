package com.burgerland.xml;

import com.burgerland.common.BurgerDTO;
import com.burgerland.common.CustomerDTO;

import java.util.List;
import java.util.Scanner;

import static com.burgerland.xml.BurgerController.*;

public class PrintResult {

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
                    burgerController.registCustomer(inputCustInfo());
                    break;
                case 2:
                    burgerController.showAllCustomer();
                    break;
                case 3:
                    burgerController.modifyCustomer(inputModifyCust());
                    break;
                case 4:
                    burgerController.deleteCustomer(inputCustCode());
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

    public void printCustList(List<CustomerDTO> custList) {
        for (CustomerDTO cust : custList) {
            System.out.println(cust);
        }
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "selectList":
                errorMessage = "고객 목록 조회를 실패했습니다.";
                break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "insert":
                successMessage = "신규 고객 등록을 성공했습니다.";
                break;
            case "update":
                successMessage = "고객 정보 수정을 성공했습니다.";
                break;
            case "delete":
                successMessage = "고객 정보 삭제를 성공했습니다.";
                break;
        }
        System.out.println(successMessage);
    }
}
