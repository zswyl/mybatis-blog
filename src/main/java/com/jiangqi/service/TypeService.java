package com.jiangqi.service;

import com.jiangqi.entity.Type;

import java.util.List;

/**
 * <p></p>
 *
 * @author 江七
 * @date 2021/4/23 14:32.
 */
public interface TypeService {

    int saveType(Type type);

    Type getType(Long id);

    List<Type> getAllType();

    List<Type> getAllTypeAndBlog();

    Type getTypeByName(String name);

    int updateType(Type type);

    void deleteType(Long id);

}