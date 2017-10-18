package com.jx.service;

import com.jx.bean.Order;
import org.apache.ibatis.annotations.Param;

/**
 * Created by CHEN JX on 2017/10/18.
 */
public interface OrderService {

    Order queryByOrderId(Integer id);
}
