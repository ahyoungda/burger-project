package com.burgerland.xml;

import com.burgerland.common.MenuDTO;

import com.burgerland.common.CustomerDTO;
import com.burgerland.common.OrderDTO;

import java.util.List;
import java.util.Map;

public interface BurgerMapper {
    List<CustomerDTO> showAllCustomer();

    int registCust(CustomerDTO cust);
    List<MenuDTO> viewMenu();

    int modifyCust(CustomerDTO cust);
    int insertMenu(MenuDTO menu);

    int deleteCust(int custCode);
    int updateMenu(Map<String, String> menu);

    int deleteMenu(int menuCode );

    int cancelMyOrder(int orderCode);


    List<OrderDTO> showMyOrder();
}
