package com.fate.gmall.service;

import com.fate.gmall.bean.PmsBaseAttrInfo;
import com.fate.gmall.bean.PmsBaseAttrValue;
import com.fate.gmall.bean.PmsBaseSaleAttr;

import java.util.List;

public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}
