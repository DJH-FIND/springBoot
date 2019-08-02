package com.tedu.sp04.order.service;

import com.tedu.sp01.pojo.User;
import com.tedu.web.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/7/31.
 */
@FeignClient(name = "user-service", fallback = UserFeignServiceFB.class)
public interface UserFeignService {
    @GetMapping("/{userId}")
    JsonResult<User> getUser(@PathVariable(value = "userId") Integer userId);

    // 拼接路径 /{userId}/score?score=新增积分
    // 如果请求参数和方法参数同名,@RequestParam可省略
    @GetMapping("/{userId}/score")
    JsonResult addScore(@PathVariable(value = "userId") Integer userId, @RequestParam(value = "score") Integer score);

}
