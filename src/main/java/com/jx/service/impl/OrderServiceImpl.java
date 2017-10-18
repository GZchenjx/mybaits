package com.jx.service.impl;

import com.jx.bean.Order;
import com.jx.dao.OrderDAO;
import com.jx.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by CHEN JX on 2017/10/18.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDAO orderDAO;

    @Override
    public Order queryByOrderId(Integer id) {
        return orderDAO.queryByOrderId(id);
    }
}
