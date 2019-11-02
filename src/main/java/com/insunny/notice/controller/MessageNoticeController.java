package com.insunny.notice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * —————Created 2019/11/2 14:05 By Fym.
 */
@RestController
public class MessageNoticeController {

    @GetMapping("/index/{number}")
    Map index(@PathVariable String number){
        Map result = new HashMap(16);
        result.put("number",number);
        return result;
    }
}
