package com.chenys.mybatisplus.controller;

import com.chenys.mybatisplus.entity.Carinfo;
import com.chenys.mybatisplus.service.CarinfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>描述: [Carinfo 控制层] </p>
 * <p>创建时间: 2020/12/08 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@RestController
@RequestMapping("/api")
public class CarinfoController {

    /**
     * (Carinfo)服务
     */
    private CarinfoService carinfoService;

    @Autowired
    public CarinfoController(CarinfoService carinfoService) {
        this.carinfoService = carinfoService;
    }

    // 删除功能，自动更正为 更新deleted字段
    @DeleteMapping("/car")
    public void delete(Integer id) {
        carinfoService.removeById(id);
    }

}