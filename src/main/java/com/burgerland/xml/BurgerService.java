package com.burgerland.xml;

import com.burgerland.common.BurgerDTO;
import com.burgerland.common.CustomerDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.burgerland.common.Template.getSqlSession;

public class BurgerService {

    private BurgerMapper custMapper;

    public List<CustomerDTO> showAllCustomer() {

//        System.out.println("서비스요청 들어옴"); // 데이터 수렴 테스트
        SqlSession sqlSession = getSqlSession();

        custMapper = sqlSession.getMapper(BurgerMapper.class);
        List<CustomerDTO> custList = custMapper.showAllCustomer();

        sqlSession.close();

        return custList;

    }

    public boolean registCustomer(CustomerDTO cust) {
        SqlSession sqlSession = getSqlSession();
        custMapper = sqlSession.getMapper(BurgerMapper.class);
        int result = custMapper.registCust(cust);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }
}
