package com.monkey.test.spring.transaction.repository;

import com.monkey.test.spring.transaction.entity.Test;
import com.monkey.test.spring.transaction.utils.JYBatis;
import java.util.List;

/**
 * The interface Test dao.
 *
 * @Author:monkey
 * @Description:
 * @Date: Create in 11:07 2017/11/11
 */
@JYBatis("testDao")
public interface TestDao {

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
    void insert(Test test);


    /**
     * Gets all.
     *
     * @return the all
     */
    List<Test> getAll();

}
