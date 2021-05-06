package com.jiangqi.service.impl;

import com.jiangqi.dao.PictureDao;
import com.jiangqi.entity.Picture;
import com.jiangqi.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>照片墙业务层接口实现类</p>
 *
 * @author 江七
 * @date 2021/5/13 23:31.
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureDao pictureDao;

    @Override
    public List<Picture> listPicture() {
        return pictureDao.listPicture();
    }

    @Override
    public int savePicture(Picture picture) {
        return pictureDao.savePicture(picture);
    }

    @Override
    public Picture getPicture(Long id) {
        return pictureDao.getPicture(id);
    }

    @Override
    public int updatePicture(Picture picture) {
        return pictureDao.updatePicture(picture);
    }

    @Override
    public void deletePicture(Long id) {
        pictureDao.deletePicture(id);
    }

}