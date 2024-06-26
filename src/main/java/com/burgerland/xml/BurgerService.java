package com.burgerland.xml;

import com.burgerland.common.BurgerDTO;
import com.burgerland.common.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.burgerland.common.Template.getSqlSession;

public class BurgerService {

    private BurgerMapper mapper;

    public void viewMenu() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(BurgerMapper.class);

        List<MenuDTO> MenuList = mapper.viewMenu();

        for(MenuDTO burger : MenuList) {

            System.out.println(burger);

        }

        sqlSession.close();


    }

    public void insertMenu(MenuDTO menu) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(BurgerMapper.class);

        int result = mapper.insertMenu(menu);

        if(result > 0) {

            System.out.println("메뉴 등록 성공");
            sqlSession.commit();

        } else {

            System.out.println("메뉴 등록 실패");
            sqlSession.rollback();
        }

        sqlSession.close();


    }

    public void updateMenu() {
    }

    public void deleteMenu() {
    }
}
