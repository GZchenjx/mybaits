package com.jx.dao;

import com.jx.bean.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by CHEN JX on 2017/10/18.
 */
@Repository
public interface OrderDAO {

    Order queryByOrderId(@Param("id") Integer id);
}
