package com.twschool.practice.controller;

import com.twschool.practice.service.GuessGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/")
@RestController
public class GuessGameController {

    @Autowired
    private GuessGameService guessGameService;

    @RequestMapping("/guessGame")
    public Map<String, String> guessGame(@RequestParam("input") String input) {
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("input", input);
        resultMap.put("result", guessGameService.guess(input));
        return resultMap;
    }
}
