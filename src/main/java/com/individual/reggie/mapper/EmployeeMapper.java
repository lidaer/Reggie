package com.individual.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.individual.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
//@Repository
public interface EmployeeMapper extends BaseMapper<Employee> {

}
