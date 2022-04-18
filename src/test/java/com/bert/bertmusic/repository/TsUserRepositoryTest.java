package com.bert.bertmusic.repository;

import cn.hutool.json.JSONUtil;
import com.bert.bertmusic.entity.TsUser;
import com.bert.bertmusic.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TsUserRepositoryTest {

    @Autowired
    TsUserRepository tsUserRepository;

    @Test
    void findByUsername() {
        TsUser tsUser = new TsUser();
        tsUser.setUsername("admin");
        tsUser.setNickname("管理员");
        tsUser.setPassword("123456");
        tsUser.setGender(Gender.MALE);
        tsUser.setLocked(false);
        tsUser.setEnabled(true);
        TsUser saveUser = tsUserRepository.save(tsUser);
        System.out.println(JSONUtil.toJsonStr(saveUser));

        TsUser dbUser = tsUserRepository.getByUsername("admin");
        System.err.println(JSONUtil.toJsonStr(dbUser));
    }
}