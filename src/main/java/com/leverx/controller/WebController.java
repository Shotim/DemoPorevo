package com.leverx.controller;

import com.leverx.service.PeopleService;
import com.leverx.service.PeopleServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class WebController {

    @Autowired
    private PeopleService peopleService;

    @GetMapping("/")
    public ModelAndView startPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/people")
    public ModelAndView showUsers() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("people");
        modelAndView.addObject("users", peopleService.findAllUsers());
        return modelAndView;
    }

    @GetMapping("people/${id}")
    public ModelAndView showOneUser(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", peopleService.findUserById(id));
        return modelAndView;
    }


}
