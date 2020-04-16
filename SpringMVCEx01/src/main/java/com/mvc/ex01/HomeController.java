package com.mvc.ex01;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.ex01.model.biz.BoardBiz;
import com.mvc.ex01.model.biz.BoardBizImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private BoardBiz biz;
	
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String selectList(Model model) {
		
		
		logger.info("selectList");
		
		model.addAttribute("list", biz.selectList());
		
		return "list";
	}
	
	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String insert(Model model) {
		
		logger.info("insert");
		
		
		return "insertForm";
	}
	
}
