package com.bert.bertmusic.mapper;

import com.bert.bertmusic.dto.UserDto;
import com.bert.bertmusic.entity.TsUser;
import com.bert.bertmusic.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserDto toDto(TsUser user);

    UserVo toVo(UserDto userDto);
}
