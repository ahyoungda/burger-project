package com.burgerland.xml;

import com.burgerland.common.BurgerDTO;
import com.burgerland.common.MenuDTO;

import com.burgerland.common.CustomerDTO;

import java.util.List;
import java.util.Map;

public interface BurgerMapper {
    List<CustomerDTO> showAllCustomer();

    int registCust(CustomerDTO cust);
    List<MenuDTO> viewMenu();

    int modifyCust(CustomerDTO cust);
    int insertMenu(MenuDTO menu);

    int deleteCust(int custCode);
    int updateMenu(Map<String, Object> menu);

    int deleteMenu(Map<String, Object> menu);
}
