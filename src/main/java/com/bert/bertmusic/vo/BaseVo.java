package com.bert.bertmusic.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class BaseVo {

    private String rid;

    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
    private Date createdTime;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新时间
     */
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
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
    @JsonFormat(timezone = "GMT+8", pattern = "yyyyMMddHHmmss")
    private Date deletedTime;
}
