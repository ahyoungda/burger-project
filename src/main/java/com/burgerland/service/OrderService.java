package com.burgerland.service;

import com.burgerland.common.OrderDTO;
import com.burgerland.xml.BurgerMapper;
import org.apache.ibatis.session.SqlSession;

import static com.burgerland.common.Template.getSqlSession;

public class OrderService {

    private BurgerMapper orderMapper;

    public boolean registOrder(OrderDTO order) {
        SqlSession sqlSession = getSqlSession();
        orderMapper = sqlSession.getMapper(BurgerMapper.class);
//        System.out.println("테스트 출력 " + order);

        int result = orderMapper.registOrder(order);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }
}
