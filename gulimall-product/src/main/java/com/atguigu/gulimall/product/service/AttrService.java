package com.atguigu.gulimall.product.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-01 21:08:49
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);

}

