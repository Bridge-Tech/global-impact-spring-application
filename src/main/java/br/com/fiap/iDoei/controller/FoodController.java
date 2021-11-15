package br.com.fiap.iDoei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoodController {
	@GetMapping("/food")
	public String index() {
		return "food";
	}
	
	@PostMapping("/food/register")
	public String save(){
		return "";
	}
}
