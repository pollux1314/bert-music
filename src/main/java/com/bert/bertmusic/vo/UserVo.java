package com.bert.bertmusic.vo;

import com.bert.bertmusic.enums.Gender;
import lombok.Data;

import java.util.List;

@Data
public class UserVo {
    private String username;

    private String nickname;

    private Gender gender;

    private Boolean locked;

    private Boolean enabled;

    private List<RoleVo> roles;
}
