package com.EmailApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.EmailApp.model.Email;
import com.EmailApp.service.EmailService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@Autowired
	private EmailService emailService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("/sendMail")
	public String sendMail(@ModelAttribute Email email, HttpSession session){
		//System.out.println(email);
		try {
			emailService.sendMail(email);
			session.setAttribute("msg", "Email Send Successfully!");
			
			session.setAttribute("msgClass", "alert-success");
			
			
		} catch (Exception e) {
			session.setAttribute("msg", "Failed to send email.");
	        session.setAttribute("msgClass", "alert-danger");
	        
		}
		
		return "redirect:/showMessage";
	}
	
	@GetMapping("/showMessage")
	public String showMessage(HttpSession session, Model model) {
	    if (session.getAttribute("msg") != null) {
	        model.addAttribute("msg", session.getAttribute("msg"));
	        model.addAttribute("msgClass", session.getAttribute("msgClass"));
	        session.removeAttribute("msg");
	        session.removeAttribute("msgClass");
	    }
	    return "index"; 
	}
}
