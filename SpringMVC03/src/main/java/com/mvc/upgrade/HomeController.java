package com.mvc.upgrade;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.upgrade.model.biz.BoardBiz;
import com.mvc.upgrade.model.biz.BoardBizImpl;
import com.mvc.upgrade.model.dto.BoardDto;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired	//자동으로 해당 객체가 있으면 bean 주입해줌
	private BoardBiz biz;
	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String List(Model model) {
		
		logger.info("SELECT LIST");
		
		
		model.addAttribute("list", biz.selectList());
		
		
		return "list";
	}
	
	@RequestMapping(value = "/detail.do", method = RequestMethod.GET)
	public String selectOne(Model model, int myno) {
		
		logger.info("SELECT ONE");
		
		model.addAttribute("dto", biz.selectOne(myno));
		
		return "detail";
	}
	
	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String insert(Model model) {
		
		logger.info("INSERT");
		
		return "insertForm";
	}
	
	@RequestMapping(value = "/insertForm.do", method = RequestMethod.GET)
	public String insertForm(Model model, BoardDto dto) {
		
		logger.info("INSERTFORM");
		
		int res = 0;
		
		res = biz.insert(dto);
		
		if(res>0) {
			return "redirect:list.do";
		}else {
			return "redirect:delail.do?myno="+dto.getMyno();
		}
		
	}
	
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String delete(Model model, int myno) {
		
		logger.info("DELETE");
		
		biz.delete(myno);
		
		model.addAttribute("list", biz.selectList());
		
		return "list";
	}
	
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update(Model model, int myno) {
		
		model.addAttribute("dto", biz.selectOne(myno));
		
		
		return "updateForm";
	}
	
	@RequestMapping(value = "/updateForm.do", method = RequestMethod.GET)
	public String updateForm(Model model, String mytitle, String mycontent,int myno) {
		
		logger.info("UPDATE");
		
		BoardDto dto = new BoardDto(myno, null, mytitle, mycontent, null);
		
		int res = biz.update(dto);
		
		if(res>0) {
			return "redirect:detail.do?myno="+dto.getMyno();
		}else {
			return "redirect:list.do";
		}
	
	}


}