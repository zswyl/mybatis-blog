package com.jiangqi.service;

import com.jiangqi.entity.Picture;

import java.util.List;

/**
 * <p>照片墙业务层接口</p>
 *
 * @author 江七
 * @date 2021/5/13 23:31.
 */
public interface PictureService {

    //查询照片
    List<Picture> listPicture();

    //添加图片
    int savePicture(Picture picture);

    //根据id查询照片
    Picture getPicture(Long id);

    //    编辑修改相册
    int updatePicture(Picture picture);

    //    删除照片
    void deletePicture(Long id);

}