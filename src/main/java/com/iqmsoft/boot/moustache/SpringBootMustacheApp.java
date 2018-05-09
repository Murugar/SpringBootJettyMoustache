package com.iqmsoft.boot.moustache;

import com.iqmsoft.boot.moustache.repository.*;


import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootMustacheApp {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootMustacheApp.class, args);
  }

  @Bean
  ApplicationRunner applicationRunner(MenuRepository menuRepository,
                                      AccountRepository accountRepository,
                                      PostRepository postRepository) {
    return args -> {
    	
      Stream.of("HOME, /", "ACCOUNT, /accounts", "POST, /posts")
          .map(str -> str.split(","))
          .map(str -> new Menu(str[0], str[1]))
          .forEach(menuRepository::save);

      Stream.of("test1, test1@test1.com", "test2, test2@test2.com" ,"test3, test3@test3.com")
          .map(str -> str.split(","))
          .map(str -> new Account(str[0], str[1]))
          .forEach(accountRepository::save);

      Stream.of("This is test1, This is test2", "This is a test3, This is a test4", 
    		  "This is test5, This is test6")
          .map(str -> str.split(","))
          .map(str -> new Post(str[0], str[1]))
          .forEach(postRepository::save);

    };
  }
  
}

