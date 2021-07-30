package com.auth.jwt.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	
	   @Override
	    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
	        return new User("test", "test",
	                new ArrayList<>());
	    }

}
