package com.oraclejava.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oraclejava.mvc.model.Member;
import com.oraclejava.mvc.service.MemberService;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private MemberService	memberService;

	// .../account/login
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Map<String, Object>model) {
		
		model.put("loginFrom", new MemberForm());
		return "account/login";
	}	
		
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(Map<String, Object>model, HttpSession session, MemberForm form) {
		
		if(form.getMemberid().equals("oraclejava") && form.getPasswd().equals("1")) {
			
			session.setAttribute("loginUser", form.getMemberid());
			
			return "redirect:/";
		}	
		else
		{
			model.put("fail", "login fail");
			
			return "login";
		}
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	public String login(Map<String, Object>model, HttpSession session) {
		
		session.invalidate();
	
		return "redirect:/";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String register(Map<String, Object>model) {
		
		model.put("memberForm", new MemberForm());
		return "account/register";
	}	
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(Map<String, Object>model, MemberForm form) throws Exception {
//		System.out.println("#1");
//		System.out.println(form);
		Member member = new Member();
		member.setMemberid(form.getMemberid());
		member.setPasswd(form.getPasswd());
		member.setEmail(form.getEmail());
		member.setUsertype("user");
		member.setActive("1");
		
//		System.out.println("#2");
//		System.out.println(member);
		
		memberService.insertMember(member);
			
		return "redirect:/account/login";
	}	
}
