package com.bert.bertmusic.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(generator = "ksuid")
    @GenericGenerator(name = "ksuid", strategy = "com.bert.bertmusic.utils.KsuidIdentifierGenerator")
    private String rid;

    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    @CreationTimestamp
    private Date createdTime;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新时间
     */
    @UpdateTimestamp
    private Date updatedTime;
    /**
     * 是否删除
     */
    private Boolean ifDelete;
    /**
     * 删除人
     */
    private String deletedBy;
    /**
     * 删除时间
     */
    private Date deletedTime;
}
