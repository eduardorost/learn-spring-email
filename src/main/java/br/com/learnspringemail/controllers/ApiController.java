package br.com.learnspringemail.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RequestMapping("/")
@ApiIgnore
@RestController
public class ApiController {

    @GetMapping
    public void swagger(HttpServletResponse response) throws IOException {
        response.sendRedirect("swagger-ui.html");
    }
}

