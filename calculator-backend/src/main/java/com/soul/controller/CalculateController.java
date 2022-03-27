package com.soul.controller;


import com.soul.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController // 这个类已经被定义为Controller并注入到SpringMVC中了
// model + controller
public class CalculateController {

    @Autowired
    CalculateService calculateService;

    // 注解开发
    @RequestMapping(method = RequestMethod.GET, value = "add")
    public int abc(int num1, int num2) {
        int result =  calculateService.add(num1, num2);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value = "sub")  // controller
    public int sub(int num1, int num2) {
        int sub = num1 - num2;  // model
        return sub;
    }

    // 乘法 TODO

    // 除法 TODO

}
