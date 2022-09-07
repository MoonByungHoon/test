package com.example.wsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatController {

  @RequestMapping(value = "/chat/room")
  public String showRoom(final int roomId){

    return "room";
  }
}
