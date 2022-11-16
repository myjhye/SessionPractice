package com.fastcampus.ch2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/list")
	public String list(HttpServletRequest request)
	{
		
		// 로그인 여부 확인
		if(request.getSession().getAttribute("id") == null) // 미로그인시
		{ 
			return "redirect:/login/login?toURL=" + request.getRequestURL(); // 로그인 화면으로 이동
		}
		
		return "boardList"; // 로그인한 상태면, 게시판 화면으로 이동
	}

}
