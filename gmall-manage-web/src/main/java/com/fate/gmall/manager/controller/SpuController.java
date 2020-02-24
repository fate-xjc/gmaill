package com.fate.gmall.manager.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.fate.gmall.bean.PmsProductInfo;
import com.fate.gmall.manager.util.PmsUploadUtil;
import com.fate.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@CrossOrigin
public class SpuController {

    @Reference
    SpuService spuService;



    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile){
        // 将图片或者音视频上传到分布式的文件存储系统

        // 将图片的存储路径返回给页面
        String imgUrl = PmsUploadUtil.uploadImage(multipartFile);
        System.out.println(imgUrl);

        return imgUrl;
    }
    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){


        return "success";
    }

    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3Id){

        List<PmsProductInfo> pmsProductInfos= spuService.spuList(catalog3Id);


        return pmsProductInfos;
    }

}
