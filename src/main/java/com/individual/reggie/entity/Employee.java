package com.individual.reggie.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Employee {
    private Long id;

    private String name;

    private String username;

    private String password;

    private String phone;

    private String sex;

    private String idNumber;

    private Integer status;

    @TableField(fill= FieldFill.INSERT)  //插入时填充
    private LocalDateTime createTime;

    @TableField(fill=FieldFill.INSERT_UPDATE)  //插入和更新时填充
    private LocalDateTime updateTime;

    @TableField(fill = FieldFill.INSERT)  //插入时填充
    private Long createUser;

    @TableField(fill = FieldFill.INSERT_UPDATE) //插入和更新时填充
    private Long updateUser;
}