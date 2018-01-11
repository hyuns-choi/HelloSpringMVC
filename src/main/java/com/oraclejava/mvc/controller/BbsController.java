package com.oraclejava.mvc.controller;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.oraclejava.mvc.model.Bbs;
import com.oraclejava.mvc.model.Member;
import com.oraclejava.mvc.service.BbsServices;

@Controller
@RequestMapping("/bbs")
public class BbsController {
	
	@Autowired
	private BbsServices bbsService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(HttpSession session, Map<String, Object> model) {
		if(session.getAttribute("loginUser") == null) {
			return "redirect:/account/login";
		}
		
		model.put("bbslist", bbsService.selectBbs());
		
		return "bbs/list";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public String write(HttpSession session, Map<String, Object> model) {
		if(session.getAttribute("loginUser") == null) {
			return "redirect:/account/login";
		}
		
		model.put("bbsForm", new BbsForm());
		
		return "bbs/writeform";
	}

	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String write(HttpSession session, BbsForm bbsForm/* GET put 명이랑 같아야함*/) throws IllegalStateException, IOException {
		if(session.getAttribute("loginUser") == null) {
			return "redirect:/account/login";
		}
		
		CommonsMultipartFile[] files = bbsForm.getFiles();
		for(CommonsMultipartFile file : files) {
			String saveFileName = Instant.now().toString().replaceAll(":","") + "-" + file.getOriginalFilename();
			File uploadFile = new File("c:/upload", saveFileName);
			file.transferTo(uploadFile);
			
			FileItem item = new FileItem();
			item.setSavedfilename(saveFileName);
			item.setUserfilename(file.getOriginalFilename());
			bbsForm.getFileItems().add(item);
		}
		
		
		bbsService.writeBbs(bbsForm);
		
		return "redirect:list";
	}

	@RequestMapping(value="/detail/{bbsno}", method=RequestMethod.GET)
	public String detail(HttpSession session,
			@PathVariable("bbsno") int bbsno,
			Map<String, Object> model) {
		if(session.getAttribute("loginUser") == null) {
			return "redirect:/account/login";
		}
		
		BbsForm bbsForm = bbsService.detailBbs(bbsno);
		
		model.put("bbs", bbsForm);
		
		return "bbs/detail";
	}
}
