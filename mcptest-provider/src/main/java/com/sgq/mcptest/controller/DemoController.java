package com.sgq.mcptest.controller;

import com.sgq.mcptest.service.DemoService;
import com.sgq.mcptest.vo.req.SayHelloReq;
import com.sgq.mcptest.vo.res.SayHelloRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public SayHelloRes sayHello(SayHelloReq req) {
        return demoService.sayHello(req);
    }

}