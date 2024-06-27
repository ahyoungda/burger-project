package com.burgerland.common;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

// Customer DTO
public class CustomerDTO {

    private int customerCode;
    private String customerName;
//    private LocalDate regDate; // LocalDate로 변경 예정
    private String regDate;
    private String customerGrade;
}