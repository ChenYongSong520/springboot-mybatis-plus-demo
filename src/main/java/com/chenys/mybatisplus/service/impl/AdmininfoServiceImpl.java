package com.chenys.mybatisplus.service.impl;

import com.chenys.mybatisplus.entity.Admininfo;
import com.chenys.mybatisplus.dao.AdmininfoDao;
import com.chenys.mybatisplus.service.AdmininfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>描述: [Admininfo 服务实现层] </p>
 * <p>创建时间: 2020/12/08 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Service
public class AdmininfoServiceImpl extends ServiceImpl<AdmininfoDao, Admininfo> implements AdmininfoService {
    
    private AdmininfoDao admininfoDao;
    
    @Autowired
    public AdmininfoServiceImpl(AdmininfoDao admininfoDao) {
        this.admininfoDao = admininfoDao;
    }
    
}