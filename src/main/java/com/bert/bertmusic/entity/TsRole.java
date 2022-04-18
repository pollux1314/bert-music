package com.bert.bertmusic.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
public class TsRole extends AbstractEntity {
    
    @Column(unique = true)
    private String roleCode;

    private String roleName;

    private String roleDesc;
}
