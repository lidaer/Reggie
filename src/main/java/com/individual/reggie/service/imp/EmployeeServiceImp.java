package com.individual.reggie.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.individual.reggie.entity.Employee;
import com.individual.reggie.mapper.EmployeeMapper;
import com.individual.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImp extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService {

}
