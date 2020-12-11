package com.chenys.mybatisplus.entity.enums;

import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>描述: [类型描述] </p>
 * <p>创建时间: 2020/12/11 </p>
 *
 * @author <a href="mailto:Chenyongsong0@163.com" rel="nofollow">陈永松</a>
 * @version v1.0
 */
@Getter
@AllArgsConstructor
public enum SexEnum implements IEnum<Integer> {
    MALE(1, "男"), FEMALE(2, "女");
    private final Integer value;
    @JsonValue
    private final String desc;
}
