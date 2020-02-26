package com.fate.gmall.item.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.fate.gmall.bean.PmsProductSaleAttr;
import com.fate.gmall.bean.PmsSkuInfo;
import com.fate.gmall.service.SkuService;
import com.fate.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class ItemController {

    @Reference
    SkuService skuService;

    @Reference
    SpuService spuService;

    @RequestMapping("{skuId}.html")
    public String item(@PathVariable String skuId, ModelMap map){
        PmsSkuInfo pmsSkuInfo=skuService.getSkuId(skuId);

        map.put("skuInfo",pmsSkuInfo);
        //销售属性列表
        List<PmsProductSaleAttr> pmsProductSaleAttrs = spuService.spuSaleAttrListCheckBySku(pmsSkuInfo.getProductId());
        map.put("spuSaleAttrListCheckBySku",pmsProductSaleAttrs);

        return "item";
    }
}
