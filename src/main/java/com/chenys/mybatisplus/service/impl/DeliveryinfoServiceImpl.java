package com.chenys.mybatisplus.service.impl;

import com.chenys.mybatisplus.entity.Deliveryinfo;
import com.chenys.mybatisplus.dao.DeliveryinfoDao;
import com.chenys.mybatisplus.service.DeliveryinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>描述: [Deliveryinfo 服务实现层] </p>
 * <p>创建时间: 2020/12/09 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Service
public class DeliveryinfoServiceImpl extends ServiceImpl<DeliveryinfoDao, Deliveryinfo> implements DeliveryinfoService {
    
    private DeliveryinfoDao deliveryinfoDao;
    
    @Autowired
    public DeliveryinfoServiceImpl(DeliveryinfoDao deliveryinfoDao) {
        this.deliveryinfoDao = deliveryinfoDao;
    }

    @Override
    public List<Deliveryinfo> ddd() {
        return baseMapper.selectList(null);
    }
}