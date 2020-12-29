package com.kang.service;

import com.kang.dao.GoodsDao;
import com.kang.pojo.Goods;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImp implements GoodsService {
private GoodsDao goodsDao;

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    public List<Goods> queryAllGoods() {
        return goodsDao.queryAllGoods();
    }

    @Override
    public Goods queryGoodsById(int id) {
        return goodsDao.queryGoodsById(id);
    }

    @Override
    public int addGoods(Goods goods) {
        return goodsDao.addGoods(goods);
    }

    @Override
    public int updateGoods(Goods goods) {
        return goodsDao.updateGoods(goods);
    }

    @Override
    public int deleteGoods(int id) {
        return goodsDao.deleteGoods(id);
    }
}
