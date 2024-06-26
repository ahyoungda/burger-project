package com.burgerland.xml;

import com.burgerland.common.BurgerDTO;
import com.burgerland.common.MenuDTO;

import java.util.List;
public interface BurgerMapper {

    List<MenuDTO> viewMenu();
}
