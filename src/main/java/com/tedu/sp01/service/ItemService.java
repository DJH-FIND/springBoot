package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Item;

import java.util.List;

/**
 * Created by Administrator on 2019/7/30.
 */
public interface ItemService {
    List<Item> getItems(String orderId);
    void decreaseNumbers(List<Item> list);
}
