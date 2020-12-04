package com.orsys.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.orsys.model.Vendeur;

@Controller
public class MainController {
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		Vendeur v=new Vendeur();
		model.addAttribute("vendeur",v );
		
		return "vendeur";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("vendeur") Vendeur vendeur,Model model) {
		
model.addAttribute("current",vendeur);
		
		return "single";
	}
	
}
