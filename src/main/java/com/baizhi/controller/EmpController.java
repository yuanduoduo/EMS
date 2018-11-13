package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/queryAll")
    public String queryAll(HttpServletRequest request, String dept) {
        List<Emp> queryAll = empService.findAll(dept);
        request.setAttribute("queryAll", queryAll);
        return "emp/emplist";
    }

    @RequestMapping("/insert")
    public String insert(Emp emp) {
        empService.save(emp);
        return "redirect:/emp/queryAll";
    }

    @RequestMapping("/delete")
    public String delete(Emp emp) {
        empService.remove(emp.getId().toString());
        return "redirect:/emp/queryAll";
    }

    @RequestMapping("/update")
    public String update(Emp emp) {
        empService.motify(emp);
        return "redirect:/emp/queryAll";
    }

}
