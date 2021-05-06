package com.jiangqi.service;

import com.jiangqi.entity.FriendLink;

import java.util.List;

/**
 * <p>友链业务层接口</p>
 *
 * @author 江七
 * @date 2021/5/13 13:54.
 */
public interface FriendLinkService {

    //查询所有友链
    List<FriendLink> listFriendLink();

    //友链新增
    int saveFriendLink(FriendLink friendLink);

    //根据id查询友链
    FriendLink getFriendLink(Long id);

    //根据网址查询友链
    FriendLink getFriendLinkByBlogaddress(String blogaddress);

    //编辑修改友链
    int updateFriendLink(FriendLink friendLink);

    //删除友链
    void deleteFriendLink(Long id);


}