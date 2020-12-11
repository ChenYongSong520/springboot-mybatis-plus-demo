package com.chenys.mybatisplus.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.chenys.mybatisplus.entity.enums.SexEnum;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * <p>描述: [Administrator 实体类] </p>
 * <p>创建时间: 2020/12/11 </p>
 *
 * @author <a href="mailto:chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrator implements Serializable {
    private static final long serialVersionUID = -98716728241289582L;

    private String id;

    private String name;

    private SexEnum sex;

    private Integer age;

    @TableField(value = "is_deleted",fill = FieldFill.INSERT)
    private Boolean deleted;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

}