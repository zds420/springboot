package com.idszhu.framework.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class TestController {

	@RequestMapping("/helloworld")
    public String helloworld() {
        return "helloworld-idszhu";
    }
}