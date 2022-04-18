package com.bert.bertmusic.service;

import com.bert.bertmusic.dto.UserDto;
import com.bert.bertmusic.mapper.UserMapper;
import com.bert.bertmusic.repository.TsUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TsUserServiceImpl implements TsUserService {

    TsUserRepository tsUserRepository;

    UserMapper userMapper;

    @Override
    public List<UserDto> list() {
        return tsUserRepository.findAll().stream().map(userMapper::toDto).collect(java.util.stream.Collectors.toList());
    }

    @Autowired
    public void setTsUserRepository(TsUserRepository tsUserRepository) {
        this.tsUserRepository = tsUserRepository;
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
