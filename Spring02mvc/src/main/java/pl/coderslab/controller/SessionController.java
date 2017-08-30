package pl.coderslab.controller;

import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.WebUtils;

@Controller
@SessionAttributes({ "count", "max" })
public class SessionController {

	@RequestMapping("/loginStart")
	@ResponseBody
	public String loginStart(Model model, HttpSession ses) {
		String loginStart = (String) ses.getAttribute("loginStart");
		if (loginStart == null || "".equals(loginStart)) {
			ses.setAttribute("loginStart", (new Date()).toString());
		}
		loginStart = (String) ses.getAttribute("loginStart");
		return loginStart;
	}

	@RequestMapping("/session2")
	@ResponseBody
	public String session2(Model model, HttpSession ses) {
		Integer sesMax = (Integer) ses.getAttribute("max");
		System.out.println(sesMax);
		return "session";
	}

	@RequestMapping("login")
	public String home(Model model) {
		model.addAttribute("max", 12);
		model.addAttribute("count", 99);
		return "home";
	}

	@RequestMapping("/cookieSet")
	@ResponseBody
	public String homeJsp(HttpServletResponse response) {
		response.addCookie(new Cookie("cookie1", "value1"));
		response.addCookie(new Cookie("cookie2", "value2"));
		return "setCookies";
	}

	@RequestMapping("/cookieGet")
	@ResponseBody
	public String home(@CookieValue("cookie1") String fooCookie, HttpServletRequest request) {
		return "cookie" + fooCookie;
	}
}
