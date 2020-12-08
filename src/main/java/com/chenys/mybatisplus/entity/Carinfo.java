package com.chenys.mybatisplus.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * <p>描述: [Carinfo 实体类] </p>
 * <p>创建时间: 2020/12/08 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carinfo implements Serializable {
    private static final long serialVersionUID = 720746031238616301L;
    
    private Integer id;
    
    private String carnum;
    
    private String insurancedate;
    
    private Date registerdate;
    
    private String carstatus;
    
    private String carmodel;

    @TableField("is_deleted")
    private Integer deleted;

}