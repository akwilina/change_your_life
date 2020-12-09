package projects.cyl.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import projects.cyl.web.command.RegisterUserCommand;

@Controller @Slf4j @RequiredArgsConstructor
@RequestMapping("/register")
public class RegistrationController {


    @GetMapping
    public String getRegister() {
        return "register/form";
    }

    @PostMapping
    //To registration we need: username, password
    public String processRegister(RegisterUserCommand registerUserCommand, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return "register/form";
        }
        return "redirect:/login";
    }
}
