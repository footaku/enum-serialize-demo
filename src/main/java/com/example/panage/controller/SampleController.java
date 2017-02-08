package com.example.panage.controller;

import com.example.panage.model.Sample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author panage
 */
@Controller
@RequestMapping("/")
public class SampleController {
    @GetMapping
    public String index() {
        return "sample";
    }

    @PostMapping("log")
    public String log(@RequestBody Sample sample) {
        System.out.println("hoge = " + sample.getHoge());
        System.out.println("fuga = " + sample.getFuga());
        System.out.println("flag = " + sample.getFlag());

        return "redirect:sample";
    }
}
