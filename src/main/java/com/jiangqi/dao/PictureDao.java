package com.jiangqi.dao;

import com.jiangqi.entity.Picture;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>照片墙持久层接口</p>
 *
 * @author 江七
 * @date 2021/5/13 23:33.
 */
@Mapper
@Repository
public interface PictureDao {

    List<Picture> listPicture();

    int savePicture(Picture picture);

    Picture getPicture(Long id);

    int updatePicture(Picture picture);

    void deletePicture(Long id);

}