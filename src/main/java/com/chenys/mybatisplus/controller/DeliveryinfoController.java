package com.chenys.mybatisplus.controller;

import com.chenys.mybatisplus.entity.Admininfo;
import com.chenys.mybatisplus.entity.Deliveryinfo;
import com.chenys.mybatisplus.service.DeliveryinfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>描述: [Deliveryinfo 控制层] </p>
 * <p>创建时间: 2020/12/09 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@RestController
@RequestMapping("/api")
public class DeliveryinfoController {

    /**
     * (Deliveryinfo)服务
     */
    private DeliveryinfoService deliveryinfoService;

    @Autowired
    public DeliveryinfoController(DeliveryinfoService deliveryinfoService){
        this.deliveryinfoService = deliveryinfoService;
    }

    // 通用枚举类
    @GetMapping("/deliverys")
    public List<Deliveryinfo> list() {
        List<Deliveryinfo> ddd = deliveryinfoService.ddd();
        return ddd;
    }
    
}