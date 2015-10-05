package com.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.dao.UserDao;

@Controller
public class Index {
	@Autowired
	private UserDao userDao;
	@RequestMapping(value = "/index.html")
	public ModelAndView index(HttpServletRequest request,
			HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView("index", "count", userDao.getUserInfo());
		return mv;
	}
}