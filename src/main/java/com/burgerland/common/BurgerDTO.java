package com.burgerland.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

// DB의 모든 테이블의 컬럼
public class BurgerDTO {

    private int customerCode;
    private String customerName;
    private String regDate;
    private String customerGrade;
    private int orderCode;
    private int menuCode;
    private String orderDate;
    private String menuName;
    private int menuPrice;
    private String category;

}
