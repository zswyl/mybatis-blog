package com.jiangqi.service.impl;

import com.jiangqi.dao.UserDao;
import com.jiangqi.entity.User;
import com.jiangqi.service.UserService;
import com.jiangqi.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>用户业务层接口实现类</p>
 *
 * @author 江七
 * @date 2021/4/22 11:06.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}