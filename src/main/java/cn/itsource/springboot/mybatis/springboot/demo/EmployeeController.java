package cn.itsource.springboot.mybatis.springboot.demo;

import cn.itsource.springboot.mybatis.domain.Employee;
import cn.itsource.springboot.mybatis.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    IEmployeeService employeeService;


    @RequestMapping("/list")
    @ResponseBody
    public List<Employee> list(){
        System.out.println("!!!!!!!!!!");
        return employeeService.LoadAll();
    }
    /*@RequestMapping("/list")
    public Model list(Model model){
        model.addAttribute(employeeService.LoadAll());
        return model ;
    }*/

    @RequestMapping("/user/{id}")
    @ResponseBody
    public Employee getUser(@PathVariable("id") Long id) {
        System.out.println("!!!!!!!!!!");
        return employeeService.loadOneById(id);

    }
}
