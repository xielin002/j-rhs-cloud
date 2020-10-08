package com.xingyue.web.controller;

import com.xingyue.web.feign.FeignApis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestWebController {

    @Autowired
    private FeignApis feignApis;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getTest(@RequestParam String name) {
        return this.feignApis.get(name);
    }

}