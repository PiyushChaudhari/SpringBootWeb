package com.web.application.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.core.application.dao.UserDao;
import com.core.application.model.User;

@Controller
@RequestMapping(value = { "/", "/home" })
public class HomeController {
	
	@Autowired
	UserDao userDao;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	@Transactional
	public ModelAndView user() {
		System.out.println("Called....");
		ModelAndView mv = new ModelAndView("index", "dt", new java.util.Date());
		User user = new User();
		user.setFirstName("Piyush");
		user.setLastName("Chaudhari");
		user.setEmail("piyush.chaudhari@gmail.com");
		user.setPasswordHash("test");
		userDao.save(user);
		return mv;
	}

}
