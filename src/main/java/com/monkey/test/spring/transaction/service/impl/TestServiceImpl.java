package com.monkey.test.spring.transaction.service.impl;

import com.monkey.test.spring.transaction.entity.Test;
import com.monkey.test.spring.transaction.repository.TestDao;
import com.monkey.test.spring.transaction.service.TestService;
import com.monkey.test.spring.transaction.utils.datasource.ReadDataSource;
import com.monkey.test.spring.transaction.utils.datasource.WriteDataSource;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Test service.
 *
 * @Author:monkey
 * @Description:
 * @Date: Create in 11:04 2017/11/11
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    @ReadDataSource("read")
    public Test getOne() {
        return testDao.getOne();
    }

    @Override
    @WriteDataSource("write")
    public void insert(Test test) {
        testDao.insert(test);
    }

    @Override
    @ReadDataSource("read")
    public List<Test> getAll(){
        return testDao.getAll();
    }
}
