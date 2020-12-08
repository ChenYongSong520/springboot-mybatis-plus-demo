package com.chenys.mybatisplus.service.impl;

import com.chenys.mybatisplus.entity.Carinfo;
import com.chenys.mybatisplus.dao.CarinfoDao;
import com.chenys.mybatisplus.service.CarinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>描述: [Carinfo 服务实现层] </p>
 * <p>创建时间: 2020/12/08 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Service
public class CarinfoServiceImpl extends ServiceImpl<CarinfoDao, Carinfo> implements CarinfoService {
    
    private CarinfoDao carinfoDao;
    
    @Autowired
    public CarinfoServiceImpl(CarinfoDao carinfoDao) {
        this.carinfoDao = carinfoDao;
    }
    
}