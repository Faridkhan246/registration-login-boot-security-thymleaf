package net.javaguides.springboot.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.dto.UserRegistrationtDto;
import net.javaguides.springboot.model.User;

public interface UserService extends UserDetailsService  {
        
	User save(UserRegistrationtDto registrationDto);

	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
	
}
 