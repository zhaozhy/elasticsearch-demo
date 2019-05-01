package com.example.demo;

import com.example.demo.Interface.GoodsRepository;
import com.example.demo.entity.Goods;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.xml.crypto.Data;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private GoodsRepository goodsRepository;
    @Test
    public void contextLoads() {
        Goods  goods=new Goods();
        goods.setId(10L);
        goods.setBrandId(1000L);
        goods.setCid1(1L);
        goods.setCid2(2L);
        goods.setCid3(3L);
        goods.setSubtitle("fdsafdsaf");
        goodsRepository.save(goods);

    }

}
