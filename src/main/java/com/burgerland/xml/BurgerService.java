package com.burgerland.xml;

import com.burgerland.common.BurgerDTO;
import com.burgerland.common.CustomerDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.burgerland.common.Template.getSqlSession;

public class BurgerService {

    private BurgerMapper custMapper;

//    public void burgerOrder() {
//    }
//
//    public void burgerMenu() {
//    }
//
//    public void burgerCustomer() {
//    }

    public List<CustomerDTO> showAllCustomer() {

//        System.out.println("서비스요청 들어옴"); // 데이터 수렴 테스트
        SqlSession sqlSession = getSqlSession();

        custMapper = sqlSession.getMapper(BurgerMapper.class);
        List<CustomerDTO> custList = custMapper.showAllCustomer();

        sqlSession.close();

        return custList;

    }
}
