package com.iqmsoft.boot.moustache.repository;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
public class Account {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String email;

  Account() {

  }

  public Account(String name, String email) {
    this.name = name;
    this.email = email;
  }
}
