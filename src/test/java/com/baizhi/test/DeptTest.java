package com.baizhi.test;

import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DeptTest extends BaseTest {
    @Autowired
    private DeptService deptService;

    @Test
    public void test1() {
        List<Dept> all = deptService.findAll();
        for (Dept dept : all) {
            System.out.println(dept);
        }
    }
}
