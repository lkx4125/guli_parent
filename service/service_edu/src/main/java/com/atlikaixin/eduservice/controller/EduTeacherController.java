package com.atlikaixin.eduservice.controller;


import com.atlikaixin.eduservice.entity.EduTeacher;
import com.atlikaixin.eduservice.service.EduTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@Api(tags = "讲师管理")
@RestController
@RequestMapping("/eduservice/teacher")
public class EduTeacherController {

    // 注入service
    @Autowired
    private EduTeacherService teacherService;
    // 访问地址：http://localhost:8001/eduservice/teacher/findAll

    // 查询讲师表所有数据
    // rest风格
    @ApiOperation(value = "所有讲师列表")
    @GetMapping("findAll")
    public List<EduTeacher> findAll() {
        List<EduTeacher> eduTeachers = teacherService.list(null);
        return eduTeachers;
    }


    // 逻辑删除讲师的方法
    @ApiOperation(value = "逻辑删除讲师")
    @DeleteMapping("{id}")
    public boolean removeTeacher(
            @ApiParam(name = "id", value = "讲师Id", required = true)
            @PathVariable String id) {
        boolean flag = teacherService.removeById(id);
        return flag;
    }

}

