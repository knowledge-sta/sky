package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import org.springframework.data.geo.Distance;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DishService {

    void deleteBatch(List<Long> ids);

    public void saveWithFlavor(DishDTO dishDTO);

    //菜品分页查询

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);
}
