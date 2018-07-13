package com.skyguard.sps.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by liupei on 2018/7/7.
 */

@RestController
public class PolicyController {

    private final static Logger logger = LoggerFactory.getLogger(PolicyController.class);
    @RequestMapping(value = "/{name}")
    public String getName(@PathVariable String name) {

        return "this is policy service,name is " + name;
    }



}

