package com.bert.bertmusic.controller;

import com.bert.bertmusic.mapper.UserMapper;
import com.bert.bertmusic.service.TsUserService;
import com.bert.bertmusic.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class TsUserController {
    TsUserService tsUserService;
    UserMapper userMapper;

    @GetMapping
    public List<UserVo> getAllUser() {
        return tsUserService.list().stream().map(userMapper::toVo).collect(Collectors.toList());
    }

    @Autowired
    public void setTsUserService(TsUserService tsUserService) {
        this.tsUserService = tsUserService;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
