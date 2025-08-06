package com.hanzo.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("page")
public class PageController {

    @GetMapping("page1")
    public String page1() {
        return "page/page1";
    }

    @GetMapping("page2")
    public String page2() {
        return "page/page2";
    }

    @GetMapping("page3")
    public String page3() {
        return "page/page3";
    }
}
