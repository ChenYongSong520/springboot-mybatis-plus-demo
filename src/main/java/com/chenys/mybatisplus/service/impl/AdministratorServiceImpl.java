package com.chenys.mybatisplus.service.impl;

import com.chenys.mybatisplus.entity.Administrator;
import com.chenys.mybatisplus.dao.AdministratorDao;
import com.chenys.mybatisplus.service.AdministratorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>描述: [Administrator 服务实现层] </p>
 * <p>创建时间: 2020/12/11 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Service
public class AdministratorServiceImpl extends ServiceImpl<AdministratorDao, Administrator> implements AdministratorService {
    
    private AdministratorDao administratorDao;
    
    @Autowired
    public AdministratorServiceImpl(AdministratorDao administratorDao) {
        this.administratorDao = administratorDao;
    }
    
}