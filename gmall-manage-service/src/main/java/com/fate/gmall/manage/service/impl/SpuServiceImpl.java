package com.fate.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fate.gmall.bean.PmsProductInfo;
import com.fate.gmall.manage.mapper.PmsproductInfoMapper;
import com.fate.gmall.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    PmsproductInfoMapper pmsproductInfoMapper;

    @Override
    public List<PmsProductInfo> spuList(String catalog3Id) {


        PmsProductInfo pmsProductInfo = new PmsProductInfo();
        pmsProductInfo.setCatalog3Id(catalog3Id);
        List<PmsProductInfo> pmsProductInfos = pmsproductInfoMapper.select(pmsProductInfo);


        return pmsProductInfos;
    }
}
