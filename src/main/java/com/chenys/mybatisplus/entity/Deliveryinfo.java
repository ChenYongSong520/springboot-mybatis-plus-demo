package com.chenys.mybatisplus.entity;

import java.util.Date;
import java.io.Serializable;

import com.chenys.mybatisplus.entity.enums.OrgEnum;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p>描述: [Deliveryinfo 实体类] </p>
 * <p>创建时间: 2020/12/09 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deliveryinfo implements Serializable {
    private static final long serialVersionUID = 841471538152964074L;
    /**
    * 空闲-忙碌-离职-请假
    */
    private String username;
    
    private String userpass;
    
    private String nickname;
    
    private String securityquestion;
    
    private String secretanswer;
    
    private Date registerdate;
    
    private String headerimg;
    
    private String userstatus;

    private OrgEnum type;
}