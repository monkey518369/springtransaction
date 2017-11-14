package com.monkey.test.spring.transaction.entity;

import org.apache.ibatis.type.Alias;

/**
 * The type Test.
 *
 * @Author:monkey
 * @Description:
 * @Date: Create in 11:05 2017/11/11
 */
@Alias("test")
public class Test extends BaseEntity{

    private String name;

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
}
