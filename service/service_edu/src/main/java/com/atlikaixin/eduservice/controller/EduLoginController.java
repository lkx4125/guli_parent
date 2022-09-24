package com.atlikaixin.eduservice.controller;

import com.atlikaixin.commonutils.R;
import org.springframework.web.bind.annotation.*;

/**
 * @author : LiKaixin
 * @number : phone 15179204125
 * @create : 2022-09-22 09:58
 * @Description : 描述
 */
@RestController
@RequestMapping("/eduservice/user")
@CrossOrigin // 解决跨域问题
public class EduLoginController {

    // login
    @PostMapping("login")
    public R login() {
        return R.ok().data("token", "admin");
    }

    // info
    @GetMapping("info")
    public R info() {
        return R.ok().data("roles", "[admin]").data("name", "admin").data("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }

}
