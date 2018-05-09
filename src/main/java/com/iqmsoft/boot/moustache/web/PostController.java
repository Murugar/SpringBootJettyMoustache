package com.iqmsoft.boot.moustache.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iqmsoft.boot.moustache.repository.PostRepository;


@Controller
@RequestMapping("/posts")
public class PostController {
	
  @Autowired	
  private PostRepository postRepository;

  
  @GetMapping
  public String posts(Model model) {
    model.addAttribute("posts" , postRepository.findAll());
    return "post";
  }
}
