package com.mongodb.morphia.crud.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CRUDController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String mainPage(){
        return "index";
    }

}