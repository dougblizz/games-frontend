package com.dougblizz.library.console.controllers;

import com.dougblizz.library.console.models.GamesFront;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/console")
public class ConsoleController {
    @GetMapping
    public ModelAndView showConsole() {
        RestTemplate restTemplate = new RestTemplate();
        List<GamesFront> gamesFrontList =
                restTemplate.exchange("http://localhost:8080/games/games",
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<List<GamesFront>>() {
                        }).getBody();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("games", gamesFrontList);
        return mav;
    }
}
