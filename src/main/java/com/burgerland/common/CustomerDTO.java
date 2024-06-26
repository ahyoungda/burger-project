package com.burgerland.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class CustomerDTO {

    private int customerCode;
    private String customerName;
    private String regDate;
    private String customerGrade;
}
