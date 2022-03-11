package com.mochen.sharding.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mochen.core.common.xbo.Result;
import com.mochen.sharding.entity.xdo.StudentDO;
import com.mochen.sharding.service.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 学生 前端控制器
 * </p>
 *
 * @author 姚广举
 * @since 2022-03-11
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private IStudentService studentService;

    @GetMapping("/getStudentList")

    public Result getStudentList(){

        List<StudentDO> studentDOList = studentService.getStudentList();
        return Result.success(studentDOList);
    }

}

