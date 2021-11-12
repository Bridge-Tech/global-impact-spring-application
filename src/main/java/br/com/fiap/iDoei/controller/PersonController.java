package br.com.fiap.iDoei.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.iDoei.model.Person;
import br.com.fiap.iDoei.repository.PersonRepository;
@Controller

public class PersonController {
	
	@Autowired
	private PersonRepository repository;
	@GetMapping("/person/register")
	public String create(Person person) {
		return"registerPerson";
	}
	@PostMapping("/person/register")
	public String save(@Valid Person person, BindingResult result,  RedirectAttributes redirect) {
		if(result.hasErrors()) {
			System.out.println("Não salvando Novo Usuário ...");
			return "registerPerson";
		}
		
		Optional<Person> optional = repository.findBycpf(person.getCpf());
		if (!optional.isEmpty()) {
			System.out.println("Não salvando Novo Usuário ... CPF Já Usado");
			return "registerPerson";
		}
		if (!person.getPassword().equals(person.getRepeatPassword())) {
			System.out.println("Não salvando Novo Usuário ... Senha não são Iguais");
			return "registerPerson";
		}
		
		person.setFullAddress("R." + person.getAddress() + 
				"- " + person.getDistrict() + 
				"- Nº " + person.getNumber().toString() +
				"- "+ person.getComplement()
				);
		System.out.println("Tudo certo salvando User");
		repository.save(person);
		
		return "redirect:login";
	}
	
	
	
}
