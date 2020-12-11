package com.chenys.mybatisplus.controller;

import com.chenys.mybatisplus.service.AdministratorService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>描述: [Administrator 控制层] </p>
 * <p>创建时间: 2020/12/11 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@RestController
@RequestMapping("/administrator")
public class AdministratorController {

    /**
     * (Administrator)服务
     */
    private AdministratorService administratorService;

    @Autowired
    public AdministratorController(AdministratorService administratorService){
        this.administratorService = administratorService;
    }
    
}