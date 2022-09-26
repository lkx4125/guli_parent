package com.atlikaixin.oss.controller;

import com.atlikaixin.commonutils.R;
import com.atlikaixin.oss.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author : LiKaixin
 * @number : phone 15179204125
 * @create : 2022-09-26 11:54
 * @Description : 描述
 */
@RestController
@RequestMapping("/eduoss/fileoss")
@CrossOrigin
public class OssController {

    @Autowired
    private OssService ossService;

    // 上传头像到oss
    @PostMapping
    public R uploadOssFile(MultipartFile file) {

        // 获取上传文件，MultipartFile
        // 返回上传到Oss的路径
        String url = ossService.uploadFileAvatar(file);
        return R.ok().data("url", url);
    }

}
