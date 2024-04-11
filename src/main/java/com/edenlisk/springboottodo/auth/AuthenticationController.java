package com.edenlisk.springboottodo.auth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("email")
public class AuthenticationController {

    // Field Injection
//    @Autowired

    private AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }


    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String welcomePage(@RequestParam String email, @RequestParam String password, ModelMap model) {
        if (authenticationService.auth(email, password)) {
            model.put("email", email);
            model.put("password", password);
            return "welcome";
        }
        return "login";
    }

}
