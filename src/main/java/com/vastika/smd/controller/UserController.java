package com.vastika.smd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vastika.smd.model.User;
import com.vastika.smd.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/add_user")
	public String getAddUserForm() {
		
		return "addUser" ;
	}
	
	@RequestMapping(value = "/Hello")
	public String getHello() {
		
		return "hello" ;
	}
    
    

	
	
	
	@RequestMapping(value = "/save_user" , method = RequestMethod.POST)
	public String saveUserInfo(@ModelAttribute User user) {
		
		userService.saveUserInfo(user);
		
		return "redirect:/list_user";
		
	}
	
	@RequestMapping(value = {"/" , "/list_user"})
	public String getAllUserInfo(Model model) {
		
		model.addAttribute("users" , userService.getAllUserInfo());
		
		return "listUser";
		
	}
	
	@RequestMapping(value = "/delete_user" , method = RequestMethod.GET)
	public String deleteUserInfo(@RequestParam int id) {
		
		userService.deleteUserInfo(id);
		
		return "redirect:/list_user";
		
	}
	
	
}
