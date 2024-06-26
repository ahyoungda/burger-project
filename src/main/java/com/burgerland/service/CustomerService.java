package com.burgerland.service;

import com.burgerland.common.CustomerDTO;
import com.burgerland.xml.BurgerMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.burgerland.common.Template.getSqlSession;

public class CustomerService {

    private BurgerMapper custMapper;

    public boolean deleteCust(int custCode) {
        SqlSession sqlSession = getSqlSession();
        custMapper = sqlSession.getMapper(BurgerMapper.class);

        int result = custMapper.deleteCust(custCode);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;
    }

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

    public boolean modifyCustomer(CustomerDTO cust) {
        SqlSession sqlSession = getSqlSession();
        custMapper = sqlSession.getMapper(BurgerMapper.class);
        int result = custMapper.modifyCust(cust);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return result > 0 ? true : false;

    }
}
