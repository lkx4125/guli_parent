package com.atlikaixin.eduservice.controller;


import com.atlikaixin.eduservice.entity.EduTeacher;
import com.atlikaixin.eduservice.service.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author testjava
 * @since 2022-09-19
 */
@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {

    // 注入service
    @Autowired
    private EduTeacherService teacherService;
    // 访问地址：http://localhost:8001/eduservice/teacher/findAll

    @GetMapping("findAll")
    public List<EduTeacher> findAll() {
        List<EduTeacher> eduTeachers = teacherService.list(null);
        return eduTeachers;
    }

}

