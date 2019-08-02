package com.tedu.sp09.service;

import com.tedu.sp01.pojo.User;
import com.tedu.web.util.JsonResult;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/7/31.
 */
@Component
public class UserFeignServiceFB implements UserFeignService {
    @Override
    public JsonResult<User> getUser(Integer userId) {
        return JsonResult.err("无法获取用户信息");
    }

    @Override
    public JsonResult addScore(Integer userId, Integer score) {
        return JsonResult.err("无法增加用户积分");
    }
}
