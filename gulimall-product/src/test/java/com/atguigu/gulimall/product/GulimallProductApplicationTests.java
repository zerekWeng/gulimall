package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {
    @Resource
    BrandService brandService;
    @Test
    void test() {
        QueryWrapper<BrandEntity> brandEntityQueryWrapper = new QueryWrapper<>();
        brandEntityQueryWrapper.eq("brand_id", 1);
        List<BrandEntity> list = brandService.list(brandEntityQueryWrapper);
        list.forEach(System.out::println);
    }

}
