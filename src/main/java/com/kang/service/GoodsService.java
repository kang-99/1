package com.kang.service;

import com.kang.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;
public interface GoodsService {

    //查询所有的商品
    List<Goods> queryAllGoods();

    //通过id查询商品
    Goods queryGoodsById(int id);

    //添加商品
    int addGoods(Goods goods);

    //修改商品
    int updateGoods(Goods goods);

    //删除商品
    int deleteGoods(int id);
}
