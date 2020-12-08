package com.chenys.mybatisplus.controller;

import com.chenys.mybatisplus.entity.Admininfo;
import com.chenys.mybatisplus.entity.Carinfo;
import com.chenys.mybatisplus.service.AdmininfoService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>描述: [Admininfo 控制层] </p>
 * <p>创建时间: 2020/12/08 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@RestController
@RequestMapping("/api")
public class AdmininfoController {

    /**
     * (Admininfo)服务
     */
    private AdmininfoService admininfoService;

    @Autowired
    public AdmininfoController(AdmininfoService admininfoService) {
        this.admininfoService = admininfoService;
    }

    // 查询自动过滤 逻辑已删除 记录
    @GetMapping("/admins")
    public List<Admininfo> list() {
        return admininfoService.list();
    }
}