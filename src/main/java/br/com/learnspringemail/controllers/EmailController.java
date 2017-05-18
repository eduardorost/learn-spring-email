package br.com.learnspringemail.controllers;

import br.com.learnspringemail.inputs.Email;
import br.com.learnspringemail.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/v1/api/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void send(@RequestBody Email email) {
        emailService.send(email);
    }

}
