package com.orsys.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.orsys.model.Vendeur;

@Controller
public class MainController {
	static ArrayList<Vendeur> vendors=new ArrayList<Vendeur>();
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		Vendeur v=new Vendeur();
		model.addAttribute("vendeur",v );
		model.addAttribute("vendeurs",vendors );

		return "vendeur";
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("vendeur") Vendeur vendeur,Model model) {
		vendors.add(vendeur);
model.addAttribute("vendeurs",vendors);
		
		return "vendeur";
	}
	@RequestMapping(value = "/gros", method = RequestMethod.GET)
	public String gros(Model model) {
model.addAttribute("vendeurs",vendors);
		
		return "gros";
	}
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String single(Model model) {
model.addAttribute("vendeurs",vendors);
		
		return "single";
	}
}
