package com.monkey.test.spring.transaction.utils.datasource;

/**
 * @Author:monkey
 * @Description:
 * @Date: Create in 23:43 2017/11/13
 */
public enum DataSourceType {

    read("read","主库"),
    write("write","从库");

    private String type;

    private String name;

    DataSourceType(String type,String name){
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
