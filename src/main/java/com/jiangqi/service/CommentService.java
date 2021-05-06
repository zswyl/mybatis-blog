package com.jiangqi.service;

import com.jiangqi.entity.Comment;

import java.util.List;

/**
 * <p>博客评论业务层接口</p>
 *
 * @author 江七
 * @date 2021/5/2 13:26.
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    int saveComment(Comment comment);

//    查询子评论
//    List<Comment> getChildComment(Long blogId,Long id);

    //删除评论
    void deleteComment(Comment comment, Long id);

}