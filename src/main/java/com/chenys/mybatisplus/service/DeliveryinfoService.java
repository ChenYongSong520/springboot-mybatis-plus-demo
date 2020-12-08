package com.chenys.mybatisplus.service;

import com.chenys.mybatisplus.entity.Deliveryinfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>描述: [Deliveryinfo 服务层] </p>
 * <p>创建时间: 2020/12/09 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
public interface DeliveryinfoService extends IService<Deliveryinfo> {
    List<Deliveryinfo> ddd();
}