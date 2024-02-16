package com.pj_chat.chat.controller;


import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
//    메인 페이지 처리
    @GetMapping("/")
    public String home(){
        return "/index";
    }
//    채팅방 맵핑 및 닉네임 받아서 from_user로 사용
    @GetMapping("/chat")
    public String chatGET(HttpSession session, @RequestParam("nick") String nick, Model model){
        session.setAttribute("nick",nick);
        model.addAttribute("nick",nick);
        return "/chat";
    }
}
