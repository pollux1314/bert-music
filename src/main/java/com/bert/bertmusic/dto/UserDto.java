package com.bert.bertmusic.dto;

import com.bert.bertmusic.enums.Gender;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class UserDto {
    private String rid;

    private String username;

    private String nickname;

    private String password;

    private Gender gender;

    private Boolean locked = false;

    private Boolean enabled = true;

    private String lastLoginIp;

    private Date lastLoginTime;

    private List<RoleDto> roleList;
}
