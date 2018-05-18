package com.skyguard.sps.client.test.controller;

import com.skyguard.sps.common.test.TestDto;
import com.skyguard.sps.server.test.TestService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liupei on 2017/12/9.
 */
@RestController
public class SpringSessionTestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/api1")
    public Object api1(HttpServletRequest request) {
        TestDto testDto = new TestDto();
        testDto.setName("hhha");





        testDto.setName("hhha");
        testDto.setName("hhha");
        testDto.setName("hhha");
        testDto.setName("hhha");


        return testService.test(testDto);
    }

    @RequestMapping(value = "/api2")
    public Object api2(HttpServletRequest request) {
        request.getSession();
        System.out.println(request.getSession());
        System.out.println(request.getSession().getClass());
        System.out.println(request.getSession().getId());

        return request.getRequestURI() + " ----" + request.getRemoteHost();
    }
}
