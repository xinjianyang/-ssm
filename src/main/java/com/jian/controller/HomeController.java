package com.jian.controller;

import com.jian.service.AccountService;
import com.usercard.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinjian
 * @create 2018/5/30 0030
 */
@RestController
public class HomeController {

    @Autowired
    private AccountService accountService;

    @GetMapping()
    public String test(){
        return "success";
    }

    @GetMapping("/acc/all")
    public Response test01(){
        return accountService.findAll();
    }
}
