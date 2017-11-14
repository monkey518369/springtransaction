package com.monkey.test.spring.transaction.controller;

import com.monkey.test.spring.transaction.entity.Test;
import com.monkey.test.spring.transaction.service.TestService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author:monkey
 * @Description:
 * @Date: Create in 0:27 2017/11/11
 */
@Controller
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService testService;

    /**
     * Test string.
     *
     * @return the string
     */
    @RequestMapping("index")
    public String test(){
        System.out.println("index");
        Test test = testService.getOne();
        test.setName("meng");
        test.setId(Math.getExponent(Math.random())+"");
        testService.insert(test);
        List<Test> tests = testService.getAll();
        tests.forEach(item->{
            System.out.println(item.getId());
        });
        return "index";
    }

    @RequestMapping("read")
    public String read(){
        List<Test> tests = testService.getAll();
        tests.forEach(item->{
            System.out.println(item.getId());
        });

        System.out.println("=======");
        return "index";
    }

}
