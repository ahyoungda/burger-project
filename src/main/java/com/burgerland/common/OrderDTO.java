package com.burgerland.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class OrderDTO {
    private String customerName;
    private String customerGrade;
    private int customerContact;

    private int orderCode;
    private String orderDate;

    private String menuName;
    private int menuPrice;
}
