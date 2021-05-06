package com.jiangqi.service;

import com.jiangqi.entity.Message;

import java.util.List;

/**
 * <p></p>
 *
 * @author 江七
 * @date 2021/5/13 11:24.
 */
public interface MessageService {

    //查询留言列表
    List<Message> listMessage();

    //保存留言
    int saveMessage(Message message);

    //删除留言
    void deleteMessage(Long id);

}