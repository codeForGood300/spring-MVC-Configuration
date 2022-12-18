package io.datajek.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlayerController {

    //method to handle /showPlayerForm
    @RequestMapping("/showPlayerForm")
    public String showForm () {
        return "search-player-form";
    }

    //method to handle /processPlayerForm
    @RequestMapping("/processPlayerForm")
    public String processForm( ) {
        return "player-detail";
    }

}
