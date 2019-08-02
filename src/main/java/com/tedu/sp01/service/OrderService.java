package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.pojo.Order;

import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
public interface OrderService {
    Order getOrder(String orderId);
    void addOrder(Order order);
}
