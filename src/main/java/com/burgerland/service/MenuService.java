package com.burgerland.service;

import com.burgerland.common.MenuDTO;
import com.burgerland.xml.BurgerMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

import static com.burgerland.common.Template.getSqlSession;

public class MenuService {

    private BurgerMapper mapper;

    public List<MenuDTO> viewMenu() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(BurgerMapper.class);

        List<MenuDTO> menuList = mapper.viewMenu();

        sqlSession.close();

        return menuList;

    }

    public void insertMenu(MenuDTO menu) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(BurgerMapper.class);

        int result = mapper.insertMenu(menu);

        if (result > 0) {

            System.out.println("메뉴 등록 성공");
            sqlSession.commit();

        } else {

            System.out.println("메뉴 등록 실패");
            sqlSession.rollback();
        }

        sqlSession.close();


    }

    public boolean updateMenu(Map<String, Object> menu) {


        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(BurgerMapper.class);

        System.out.println(menu);
        int result = mapper.updateMenu(menu);
        if (result > 0) {

            System.out.println("메뉴 수정 성공");
            sqlSession.commit();

        } else {

            System.out.println("메뉴 수정 실패");
            sqlSession.rollback();
        }

        sqlSession.close();
        return result > 0 ? true : false;

    }

    public void deleteMenu(Map<String, Object> menu) {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(BurgerMapper.class);

        int result = mapper.deleteMenu(menu);

        if (result > 0) {

            System.out.println("메뉴 삭제 성공");
            sqlSession.commit();

        } else {

            System.out.println("메뉴 삭제 실패");
            sqlSession.rollback();
        }

        sqlSession.close();


    }
}
