package com.monkey.test.spring.transaction.utils.aop;

import com.monkey.test.spring.transaction.utils.datasource.DataSourceContextHolder;
import com.monkey.test.spring.transaction.utils.datasource.DataSourceType;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @Author:monkey
 * @Description:
 * @Date: Create in 0:27 2017/11/14
 */
@Aspect
@Component
public class DataSourceAop implements PriorityOrdered {

    @Before("execution(* com.monkey.test.spring.transaction.service..*.*(..))"
        + " && @annotation(com.monkey.test.spring.transaction.utils.datasource.ReadDataSource)")
    public void setReadDataSource(){
        System.out.println("read data source set");
        if(!DataSourceType.write.getType().equals(DataSourceContextHolder.geReadOrWrite())){
            DataSourceContextHolder.setRead();
        }
    }

    @Before("execution(* com.monkey.test.spring.transaction.service..*.*(..))"
        + " && @annotation(com.monkey.test.spring.transaction.utils.datasource.WriteDataSource)")
    public void setWriteDataSource(){
        System.out.println("wirte data source set");
        DataSourceContextHolder.setWrite();
    }


    @Override
    public int getOrder() {
        return 1;
    }
}
