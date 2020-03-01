package com.sl.srpingboot001.controller;

import com.sl.srpingboot001.pojo.Department;
import com.sl.srpingboot001.pojo.Employee;
import com.sl.srpingboot001.services.impl.DepartmentServiceImpl;
import com.sl.srpingboot001.services.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class EmpleyeeController {
    @Autowired
    EmployeeServiceImpl employeeService;
    @Autowired
    DepartmentServiceImpl departmentService;

    @RequestMapping("/emplist")
    public String  list(Model model){
        List<Employee> employees = employeeService.getEmployee();
        List<String> dmpss =new ArrayList();
        for (Employee employee : employees) {
            String name = departmentService.getDepartmentById(employee.getDepartmentId()).getName();
            dmpss.add(name);
        }
        model.addAttribute("emps",employees);
        model.addAttribute("dmps",dmpss);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String tpAddpage(Model model){
        List<Department> departments = departmentService.getDepartment();
        model.addAttribute("deps",departments);
    return "emp/add";
    }

    @PostMapping("/emp")
    public  String addEmployee(Employee employee){
        System.out.println(employee);
        employeeService.addEmployee(employee);
        return "redirect:emplist";
    }

    @RequestMapping("/emp/{id}")
    public String toUpdate (@PathVariable("id") Integer id, Model model){
        Employee e = employeeService.getEmployeeById(id);
        List<Department> departments = departmentService.getDepartment();
        model.addAttribute("emp",e);
        model.addAttribute("deps",departments);
        return "emp/update";
    }

    @RequestMapping("/update")
    public String update(Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/emplist";
    }

    @RequestMapping("/delete/{id}")
    public  String delete(@PathVariable("id") Integer id){
        employeeService.deleteEmployee(id);
        return "redirect:/emplist";
    }
}
