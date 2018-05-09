package com.iqmsoft.boot.moustache.repository;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;


@Data
@Entity
public class Post {

  @Id
  @GeneratedValue
  private Long id;

  private String title;

  @Lob
  private String content;

  Post() {

  }
  public Post(String title, String content){
    this.title = title;
    this.content = content;
  }
}
