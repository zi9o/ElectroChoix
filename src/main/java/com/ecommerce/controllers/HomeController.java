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
        return "homeAdmin";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "Admin/index";
    }
    
    
    
    
    // donc c'est ici qu'on va travailler
}
