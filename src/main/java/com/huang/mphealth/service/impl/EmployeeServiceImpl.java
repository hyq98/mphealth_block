package com.huang.mphealth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huang.mphealth.common.PageUtils;
import com.huang.mphealth.common.Query;
import com.huang.mphealth.dao.EmployeeDao;
import com.huang.mphealth.entity.EmployeeEntity;
import com.huang.mphealth.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("employeeService")
public class EmployeeServiceImpl extends ServiceImpl<EmployeeDao, EmployeeEntity> implements EmployeeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EmployeeEntity> page = this.page(
                new Query<EmployeeEntity>().getPage(params),
                new QueryWrapper<EmployeeEntity>()
        );

        return new PageUtils(page);
    }

}