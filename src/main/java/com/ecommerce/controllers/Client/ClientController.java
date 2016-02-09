package com.ecommerce.controllers.Client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DIALLO-IMRANA on 08/02/2016.
 */
@Controller

public class ClientController {

    @RequestMapping("/client/home")
    public String home() {

        return "Client/index";

    }




    // donc c'est ici qu'on va travailler
}
