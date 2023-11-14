package StudyGuideApp.controller;


import StudyGuideApp.service.UserDetailsServiceImpl;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

/*The Controller class main purpose is to handle the get and post requests of the web application login process
 */
@Controller
public class WebController {
    private UserDetailsServiceImpl userService;
    @GetMapping("/login")
    public String login() {

        return "login";
    }


}
