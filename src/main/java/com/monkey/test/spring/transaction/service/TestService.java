package com.monkey.test.spring.transaction.service;

import com.monkey.test.spring.transaction.entity.Test;
import com.monkey.test.spring.transaction.utils.datasource.ReadDataSource;
import com.monkey.test.spring.transaction.utils.datasource.WriteDataSource;
import java.util.List;

/**
 * The interface Test service.
 *
 * @Author:monkey
 * @Description:
 * @Date: Create in 11:04 2017/11/11
 */
public interface TestService {

    /**
     * Gets one.
     *
     * @return the one
     */
    Test getOne();


    /**
     * Insert.
     *
     * @param test the test
     */
    @WriteDataSource("write")
    void insert(Test test);

    /**
     * Gets all.
     *
     * @return the all
     */
    @ReadDataSource("read")
    List<Test> getAll();

}
