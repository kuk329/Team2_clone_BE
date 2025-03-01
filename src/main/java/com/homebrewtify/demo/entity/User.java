package com.homebrewtify.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private int userIdx;
    private String name;
    private String nickName;
    private String phone;
    private String email;
    private String password;
}
