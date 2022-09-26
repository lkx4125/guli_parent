package com.atlikaixin.oss.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : LiKaixin
 * @number : phone 15179204125
 * @create : 2022-09-26 11:53
 * @Description : 描述
 */
public interface OssService {
    // 上传头像到oss
    String uploadFileAvatar(MultipartFile file);
}
