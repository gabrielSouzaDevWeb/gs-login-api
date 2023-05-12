package com.example.login.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController{
@GetMapping()
 public void getAll(){
  System.out.println("Olá mundo!");
 }
}