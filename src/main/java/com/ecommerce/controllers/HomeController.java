/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ecommerce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author DIALLO-IMRANA
 */
@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        return "redirect:/home1";
    }

    @RequestMapping("/home1")
    public String home1() {
        return "index_1";
    }
    
    
    
    
    // donc c'est ici qu'on va travailler
}
