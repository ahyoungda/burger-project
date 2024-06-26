package com.burgerland.xml;

import com.burgerland.common.BurgerDTO;
import com.burgerland.common.MenuDTO;

import java.util.List;
import java.util.Map;

public interface BurgerMapper {

    List<MenuDTO> viewMenu();

    int insertMenu(MenuDTO menu);

    int updateMenu(Map<String, Object> menu);
}
