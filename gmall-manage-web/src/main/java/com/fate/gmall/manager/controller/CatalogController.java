package com.fate.gmall.manager.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.fate.gmall.bean.PmsBaseCatalog1;
import com.fate.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class CatalogController {

    @Reference
    CatalogService catalogService;


    @RequestMapping("getCatalog1")
    @ResponseBody


    public List<PmsBaseCatalog1> getCatalog1() {

        List<PmsBaseCatalog1> catalogls=catalogService.getCatalog1();
        return catalogls;
    }
}
