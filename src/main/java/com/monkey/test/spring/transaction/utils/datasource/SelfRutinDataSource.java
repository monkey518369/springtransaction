package com.monkey.test.spring.transaction.utils.datasource;

import java.util.HashMap;
import java.util.Map;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author:monkey
 * @Description:
 * @Date: Create in 0:13 2017/11/14
 */
public class SelfRutinDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.geReadOrWrite();
    }
}
