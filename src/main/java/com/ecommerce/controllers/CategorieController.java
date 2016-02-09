package com.ecommerce.controllers;

/**
 * Created by Zakaria on 08/02/2016.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/categorie-management/categories/*")
public class CategorieController {

    @RequestMapping
    public String getAllCategories()
    {
        //application code
        return "Admin/Categories/index";
    }

    @RequestMapping("/add")
    public String addCategorie()
    {
        //application code
        return "Admin/Categories/newCategorie";
    }

    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String updateCategorie(Model model, @PathVariable("id") Integer ID)
    {
        model.addAttribute("ID_Cat",ID);
        return "Admin/Categories/updateCategorie";
    }
}
