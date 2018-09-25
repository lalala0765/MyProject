package spring.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	
	@RequestMapping("/cookie/make.do")
	public String make(HttpServletResponse response) {
		response.addCookie(new Cookie("auth", "abc"));
		//return "/cookie/made";
		return "redirect:/cookie/view.do";
	}

	
	@RequestMapping("/cookie/view.do")
	public String view(@CookieValue(value="auth", defaultValue="0") String auth) {
		//public void view(@CookieValue(value="auth", defaultValue="0") String auth) {
		//리턴 타입이 void여도 잘 찾아갈 수 있음 (하려면 return 없애고.)
		
		System.out.println("auth 쿠키 :" + auth);
		//System.out.println("리턴타입 void");
		return "cookie/view";
	}
}
