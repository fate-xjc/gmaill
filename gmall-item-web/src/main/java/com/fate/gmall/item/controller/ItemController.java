package com.fate.gmall.item.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.fate.gmall.bean.PmsSkuInfo;
import com.fate.gmall.service.SkuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ItemController {

    @Reference
    SkuService skuService;

    @RequestMapping("{skuId}.html")
    public String item(@PathVariable String skuId, ModelMap map){
        PmsSkuInfo pmsSkuInfo=skuService.getSkuId(skuId);

        map.put("skuInfo",pmsSkuInfo);
        return "item";
    }
}
