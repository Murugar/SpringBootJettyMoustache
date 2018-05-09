package com.iqmsoft.boot.moustache.repository;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Data
@Entity
public class Menu {

  @Id
  @GeneratedValue
  private Long id;

  private String name;
  private String path;

  Menu() {

  }

  public Menu(String name, String path) {
    this.name = name;
    this.path = path;
  }

}
