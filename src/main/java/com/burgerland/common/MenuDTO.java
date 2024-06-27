package com.burgerland.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class MenuDTO {

    private int menuCode;
    private String menuName;
    private int menuPrice;
    private String category;

}
