package com.jiangqi.service;

import com.jiangqi.entity.User;

/**
 * <p>用户业务层接口</p>
 *
 * @author 江七
 * @date 2021/4/22 11:00.
 */
public interface UserService {

    //    核对用户名和密码
    User checkUser(String username, String password);
}