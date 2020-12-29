package com.kang.controller;


import com.kang.dao.GoodsDao;
import com.kang.pojo.Goods;
import com.kang.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/good")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping("/queryAllGoods")
    public String queryAllGoods(Model model){
        List<Goods> goods = goodsService.queryAllGoods();
        model.addAttribute("good","goods");
        return "allGoods";

    }

    @RequestMapping("/queryGoodsById")
    public Goods queryGoodsById(){
        Goods goods = goodsService.queryGoodsById(1);
        System.out.println(goods);
        return goods;
    }
    @RequestMapping("/addGoods")
    public String addGoods(){
        goodsService.addGoods(new Goods(8,"榴莲",20));
        return "ok";
    }
    @RequestMapping("/updateGoods")
    public String updateGoods(){
        goodsService.updateGoods(new Goods(8,"榴莲",25));
        return "ok";
    }
    @RequestMapping("/deleteGoods")
    public String deleteGoods(){
       goodsService.deleteGoods(8);
        return "ok";
    }


}
