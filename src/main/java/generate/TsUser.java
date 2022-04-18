package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * ts_user
 * @author 
 */
@Data
public class TsUser implements Serializable {
    /**
     * 租户号
     */
    private Integer tenantId;

    /**
     * 乐观锁
     */
    private String revision;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新人
     */
    private String updatedBy;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 删除人
     */
    private String deletedBy;

    /**
     * 删除时间
     */
    private Date deletedTime;

    /**
     * 是否删除
     */
    private Byte ifDeleted;

    private static final long serialVersionUID = 1L;
}