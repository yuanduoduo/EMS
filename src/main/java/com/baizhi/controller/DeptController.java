package com.baizhi.controller;

import com.baizhi.entity.Dept;
import com.baizhi.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping("/insert")
    public String insert(Dept dept) {
        deptService.save(dept);
        return "redirect:/dept/queryAll";
    }

    @RequestMapping("/update")
    public String update(Dept dept) {
        deptService.motify(dept);
        return "redirect:/dept/queryAll";
    }

    @RequestMapping("/delete")
    public String delete(Dept dept) {
        deptService.remove(dept.getId());
        return "redirect:/dept/queryAll";
    }

    @RequestMapping("/queryAll")
    public String queryAll(HttpServletRequest request) {
        List<Dept> queryAll = deptService.findAll();
        System.out.println(queryAll);
        request.setAttribute("queryAll", queryAll);
        return "dept/deptlist";
    }


}
