package com.korea.restapi.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.korea.restapi.entity.Member;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model, HttpSession session) {
		
		Member loginMember = (Member)session.getAttribute("loginMember");
		model.addAttribute("loginMember", loginMember);
		
		return "home";
	}
}

