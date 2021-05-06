package com.jiangqi.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>分类实体类</p>
 *
 * @author 江七
 * @date 2021/4/22 21:16.
 */
@Table(name = "t_type")
public class Type {

    private Long id;
    private String name;

    private List<Blog> blogs = new ArrayList<>();

    public Type() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", blogs=" + blogs +
                '}';
    }
}