package com.bert.bertmusic.entity;

import com.bert.bertmusic.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class TsUser extends AbstractEntity {
    @Column(unique = true)
    private String username;

    private String nickname;

    private String password;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Boolean locked = false;

    private Boolean enabled = true;

    private String lastLoginIp;

    private Date lastLoginTime;

    @ManyToMany(cascade = {}, fetch = FetchType.EAGER)
    @JoinTable(name = "ts_user_role",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "rid"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "rid"))
    private List<TsRole> roleList;

}
