package com.jiangqi.dao;

import com.jiangqi.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>用户持久层接口</p>
 *
 * @author 江七
 * @date 2021/4/22 11:11.
 */
@Mapper
@Repository
public interface UserDao {
    User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}