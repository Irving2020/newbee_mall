package ltd.newbee.mall.controller;

import ltd.newbee.mall.entity.SaleGoods;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test/type/conversion")
    public void typeConversionTest(String goodsName, float weight, int type, Boolean onSale) {
        System.out.println("goodsName:" + goodsName);
        System.out.println("weight:" + weight);
        System.out.println("type:" + type);
        System.out.println("onSale:" + onSale);
    }
    @RequestMapping(value = "/test/orderSale", method = RequestMethod.POST)
    public SaleGoods orderSale(@RequestBody SaleGoods saleGoods) {
        saleGoods.setType(saleGoods.getType() + 1);
        saleGoods.setGoodsName("商品名：" + saleGoods.getGoodsName());
        System.out.println(saleGoods.toString());
        return saleGoods;
    }
}

