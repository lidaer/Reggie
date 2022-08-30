package com.individual.reggie.dto;

import com.individual.reggie.entity.Dish;
import com.individual.reggie.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

//Data Transfer Object -- 数据传输对象
@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
