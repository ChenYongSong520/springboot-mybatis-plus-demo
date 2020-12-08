# springboot-mybatis-plus-demo
## 通用枚举采坑记录

##### 第零步：添加配置

```yaml
mybatis-plus:
  type-enums-package: com.chenys.mybatisplus.entity.enums # 配置扫描通用枚举
```



##### 第一步：创建一个枚举类实现 IEnum<Integer>接口

```java
@Getter
@AllArgsConstructor
public enum OrgEnum implements IEnum<Integer> {
    COMPANY(1, "公司"), DEPARTMENT(2, "部门");
    private Integer value;
    @JsonValue // 加上该注解，将 COMPANY/DEPARTMENT类型的值转换成 公司/部门
    private String desc;
}
```



##### 第二步：在枚举类的描述属性上，加上 @JsonValue注解，将 COMPANY/DEPARTMENT类型的值转换成 公司/部门

```java
@Getter
@AllArgsConstructor
public enum OrgEnum implements IEnum<Integer> {
    COMPANY(1, "公司"), DEPARTMENT(2, "部门");
    private Integer value;
    @JsonValue // 加上该注解，将 COMPANY/DEPARTMENT类型的值转换成 公司/部门
    private String desc;
}
```



##### 第三步：POJO类使用该枚举类

```java
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deliveryinfo implements Serializable {
    private static final long serialVersionUID = 841471538152964074L;

    private String username;

    private OrgEnum type;
}
```



##### PS：**枚举类对应的属性，在数据库中的数据类型不能为 tinyint(1)，否则Java会将该类型转换为 Boolean类型，导致无法转换成枚举类。**

