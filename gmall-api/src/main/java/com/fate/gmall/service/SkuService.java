package com.fate.gmall.service;

import com.fate.gmall.bean.PmsSkuInfo;

public interface SkuService {
    void saveSkuInfo(PmsSkuInfo pmsSkuInfo);

    PmsSkuInfo getSkuId(String skuId);
}
