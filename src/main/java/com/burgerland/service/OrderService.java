package com.burgerland.service;

import com.burgerland.common.OrderDTO;
import com.burgerland.xml.BurgerMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.burgerland.common.Template.getSqlSession;

public class OrderService {


    private BurgerMapper mapper;

    public List<OrderDTO> showMyOrder() {

        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(BurgerMapper.class);

        List<OrderDTO> orderList = mapper.showMyOrder();

        sqlSession.close();

        return orderList;

    }

    public boolean cancelMyOrder(int orderCode) {


        SqlSession sqlSession = getSqlSession();

        mapper = sqlSession.getMapper(BurgerMapper.class);

        int result = mapper.cancelMyOrder(orderCode);

        if (result > 0) {

            System.out.println("주문 삭제 성공");
            sqlSession.commit();

        } else {

            System.out.println("주문 삭제 실패");
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;



    }
}
