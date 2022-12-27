package io.datajek.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerController {

    @Autowired
    PlayerService playerService;
    //method to handle /showPlayerForm
    @RequestMapping("/showPlayerForm")
    public String showForm () {
        return "search-player-form";
    }

    //method to handle /processPlayerForm
    @RequestMapping("/processPlayerForm")
    public String processForm(@RequestParam("playerName") String pName, Model model) {
        String theName = pName.toUpperCase();
        Player player=playerService.getPlayerByName(pName);
        model.addAttribute("name", theName);
        model.addAttribute("country", player.getNationality());
        model.addAttribute("dob", player.getBirthDate());
        model.addAttribute("titles", player.getTitles());

        return "player-detail";
    }
}