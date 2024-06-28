package com.burgerland.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class OrderDTO {

    private int orderCode;
    private String customerName;
    private String menuName;
    private String orderDate;
    private String customerContact;
}
