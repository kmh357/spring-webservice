package com.kmh357.webservice.web;

import com.kmh357.webservice.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WebController {
    private PostService postService;

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("posts", postService.findAllDesc());
        return "main";
    }
}
