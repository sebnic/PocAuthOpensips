package com.seb.poc.authOpensips;

import static org.springframework.boot.SpringApplication.run;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AuthOpensips {

    public static void main(String[] args) {
        run(AuthOpensips.class);
    }

    @RequestMapping("/test")
    public String isAuth(@RequestParam("pai") String pai) {
        if (pai != null && pai.equals("VC")) {
            return "OK";
        } else {
            return "NOK";
        }
    }
}
