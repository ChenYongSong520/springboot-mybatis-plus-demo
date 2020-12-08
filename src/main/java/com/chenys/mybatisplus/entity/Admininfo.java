package com.chenys.mybatisplus.entity;

import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * <p>描述: [Admininfo 实体类] </p>
 * <p>创建时间: 2020/12/08 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admininfo implements Serializable {
    private static final long serialVersionUID = 770012049053158293L;
    
    private String username;
    
    private String userpass;
    
    private String nickname;
    
    private String securityquestion;
    
    private String secretanswer;
    
    private Date registerdate;
    
    private String headerimg;
    /**
    * 空闲-忙碌-离职-请假
    */
    private String userstatus;

    @TableField("is_deleted")
    private Integer deleted;

}