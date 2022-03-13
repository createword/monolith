package com.mochen.sharding.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mochen.sharding.entity.xdo.StudentDO;
import com.mochen.sharding.mapper.StudentMapper;
import com.mochen.sharding.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 学生 服务实现类
 * </p>
 *
 * @author 姚广举
 * @since 2022-03-11
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, StudentDO> implements IStudentService {

    @Override
    public List<StudentDO> getStudentList() {
        return this.list(new QueryWrapper<StudentDO>()
                .eq("analysis_no","JN20200101010101")
                .eq("year",2020));
    }
}
