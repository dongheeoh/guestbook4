package com.douzone.guestbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.douzone.guestbook.dao.GuestBookDao;
import com.douzone.guestbook.vo.GuestBookVo;


@Controller
public class GuestbookController {
	
	@Autowired
	private GuestBookDao guestbookDao;
	
	@RequestMapping({"","/list"})
	public String list(Model model) {
		model.addAttribute("list",guestbookDao.getList());
		return "list";
	}
	
	@RequestMapping("/deleteform")
	public String form(@RequestParam(value="no",required=false) Long no) {
		return "deleteform";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(GuestBookVo guestbookVo) {
		guestbookDao.insert(guestbookVo);
		return "redirect:/";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String delete(GuestBookVo guestbookVo) {
		guestbookDao.delete(guestbookVo);
		return "redirect:/";
	}
	
	
	//@RequestParam(value="no",required=false) Long no
}
