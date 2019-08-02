package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;


/**
 * Created by Administrator on 2019/7/30.
 */
public interface UserService {
    User getUser(Integer id);
    void addScore(Integer id, Integer score);
}
