package com.individual.reggie.service.imp;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.individual.reggie.entity.OrderDetail;
import com.individual.reggie.mapper.OrderDetailMappper;
import com.individual.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMappper, OrderDetail> implements OrderDetailService {
}
