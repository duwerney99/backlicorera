package com.proyecto.licoreraApp.controller;

import com.proyecto.licoreraApp.models.Productos;
import com.proyecto.licoreraApp.repository.IProductosRepo;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @Autowired
    private IProductosRepo repo;


    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", defaultValue = "Licorera") String name, Model model) {
        //logica
        model.addAttribute("name", name);
        return "greeting";
    }


    @GetMapping("/listar")
    public String greeting(Model model) {
        //logica
        model.addAttribute("productos",  repo.findAll());
        return "greeting";
    }
}
