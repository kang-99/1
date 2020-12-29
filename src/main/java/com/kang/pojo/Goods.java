package com.kang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Goods {
    public  int id;
    public String goodsname;
    public int goodsprice;

    public Goods(int id, String goodsname, int goodsprice) {
        this.id = id;
        this.goodsname = goodsname;
        this.goodsprice = goodsprice;
    }
}

