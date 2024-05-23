package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.springboot.dto.UserRegistrationtDto;
import net.javaguides.springboot.service.UserService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
		
	}
	@ModelAttribute("user")
	public UserRegistrationtDto userRegistrationDto() {
		return new UserRegistrationtDto();
	}
	@GetMapping
	public String showRegistrationForm() {
		return "registration";

		}
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user")UserRegistrationtDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
	
	
}
