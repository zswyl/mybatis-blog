package com.jiangqi.service;

import com.jiangqi.entity.Blog;
import com.jiangqi.queryvo.*;

import java.util.List;

/**
 * <p>博客列表业务层接口</p>
 *
 * @author 江七
 * @date 2021/4/26 23:31.
 */
public interface BlogService {

    ShowBlog getBlogById(Long id);

    List<BlogQuery> getAllBlog();

    int saveBlog(Blog blog);

    int updateBlog(ShowBlog showBlog);

    void deleteBlog(Long id);

    List<BlogQuery> getBlogBySearch(SearchBlog searchBlog);

    List<FirstPageBlog> getAllFirstPageBlog();

    List<RecommendBlog> getRecommendedBlog();

//    List<FirstPageBlog> getNewBlog();

    List<FirstPageBlog> getSearchBlog(String query);

    DetailedBlog getDetailedBlog(Long id);

    //根据TypeId获取博客列表，在分类页进行的操作
    List<FirstPageBlog> getByTypeId(Long typeId);

    Integer getBlogTotal();

    Integer getBlogViewTotal();

    Integer getBlogCommentTotal();

    Integer getBlogMessageTotal();

}