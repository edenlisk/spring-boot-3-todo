package com.edenlisk.springboottodo.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

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
