package com.iqmsoft.boot.moustache.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iqmsoft.boot.moustache.repository.AccountRepository;


@Controller
@RequestMapping("/accounts")
public class AccountController {

  @Autowired	
  private AccountRepository accountRepository;

 
  @GetMapping
  public String accounts(Model model) {
    model.addAttribute("accounts", accountRepository.findAll());
    return "account";
  }

}
