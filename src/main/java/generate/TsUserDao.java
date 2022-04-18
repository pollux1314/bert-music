package generate;

import generate.TsUser;

public interface TsUserDao {
    int deleteByPrimaryKey(Integer tenantId);

    int insert(TsUser record);

    int insertSelective(TsUser record);

    TsUser selectByPrimaryKey(Integer tenantId);

    int updateByPrimaryKeySelective(TsUser record);

    int updateByPrimaryKey(TsUser record);
}