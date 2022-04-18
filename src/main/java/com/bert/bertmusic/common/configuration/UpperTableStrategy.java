package com.bert.bertmusic.common.configuration;

import cn.hutool.core.util.StrUtil;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.stereotype.Component;

@Component
public class UpperTableStrategy extends PhysicalNamingStrategyStandardImpl {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        // 将表名所有转换成大写
        String tableName = StrUtil.toUnderlineCase(name.getText()).toUpperCase();

        return name.toIdentifier(tableName);
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
        String colnumName = StrUtil.toUnderlineCase(name.getText()).toUpperCase();
        return name.toIdentifier(colnumName);
    }
}
