package com.chenys.mybatisplus;

import com.chenys.mybatisplus.entity.Administrator;
import com.chenys.mybatisplus.entity.enums.SexEnum;
import com.chenys.mybatisplus.service.AdministratorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MybatisPlusDemoApplicationTests {


    @Autowired
    private AdministratorService administratorService;

    @Test
    void contextLoads() {
        List<Administrator> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Administrator administrator = new Administrator();
            administrator.setAge(18 + i);
            administrator.setName("chenys--" + i);
            administrator.setSex(SexEnum.MALE);
			list.add(administrator);
        }
		boolean b = administratorService.saveBatch(list);
		System.out.println(b);
	}

    @Test
    void contextLoads2() {
        Administrator administrator = new Administrator();
        administrator.setId("02bb33eb192d7add9490f497b0f746d6");
        administrator.setSex(SexEnum.FEMALE);
        System.out.println(administratorService.updateById(administrator));
    }

}
