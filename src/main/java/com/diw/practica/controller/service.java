package com.diw.practica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller(value = "/diw")
public class service {
    /**
     *
     * @return
     */
    @GetMapping("/hola1")
    public String hello()
    {
        return "Hello World";

    }
    /**
     *
     * @return
     */

    @GetMapping("/hola2")
    public String hello2()
    {
        return "Hello World 2";

    }
    /**
     *
     * @return
     */



}
