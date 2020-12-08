package com.chenys.mybatisplus.entity.enums;


import com.baomidou.mybatisplus.annotation.EnumValue;
import com.baomidou.mybatisplus.core.enums.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>描述: [类型描述] </p>
 * <p>创建时间: 2020/12/9 </p>
 *
 * @author <a href="mailto:Chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Getter
@AllArgsConstructor
public enum OrgEnum implements IEnum<Integer> {
    COMPANY(1, "公司"), DEPARTMENT(2, "部门");
    private Integer value;
    @JsonValue // 加上该注解，将 COMPANY/DEPARTMENT类型的值转换成 公司/部门
    private String desc;
}
