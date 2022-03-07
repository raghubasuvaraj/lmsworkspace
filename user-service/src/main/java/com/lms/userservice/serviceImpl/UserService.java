package com.lms.userservice.serviceImpl;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lms.userservice.entity.Users;
import com.lms.userservice.repository.UserRepository;



@Service
public class UserService implements UserDetailsService{

	 
	    @Autowired
	    private UserRepository repo;
	    
	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	    	Users user = repo.findByUsername(username);
	    	 List<SimpleGrantedAuthority> authorities = new ArrayList<>();

	        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
	    }
	     
	    
	    public List<Users> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(Users users) {
	        repo.save(users);
	    }
	     
	    
	    
}
