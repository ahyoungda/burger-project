package com.burgerland.xml;

import com.burgerland.common.BurgerDTO;
import com.burgerland.common.CustomerDTO;

import java.util.List;

public class PrintResult {
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
