package com.tekion.todo.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    //    @Autowired
    //    AuthenticationService authenticationService;
    private Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goToWelcome(ModelMap model) {
        model.put("name", getLoggedInUsername());
        return "welcome";
    }

    private String getLoggedInUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
    //    @RequestMapping(value = "/login", method = RequestMethod.POST)
    //    public String goToWelcome(@RequestParam String name, String password, ModelMap model) {
    //        model.put("name", name);
    //        model.put("password", password);
    //        if (authenticationService.authenticate(name, password)) {
    //            return "welcome";
    //        }
    //        model.put("errorMsg", "Invalid Cedentials");
    //        return "login";
    //    }
}
