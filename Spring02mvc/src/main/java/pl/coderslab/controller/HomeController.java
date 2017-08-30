package pl.coderslab.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/first")
public class HomeController {
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String helloWorld() {
		return "Hello World";
	}

	@RequestMapping("/helloParam")
	@ResponseBody
	private String helloParam(HttpServletRequest request) {
		String param = request.getParameter("paramName");
		System.out.println(param);
		return "My param = " + param;
	}

	@RequestMapping("/helloRequestParams")
	@ResponseBody
	private String helloRequestParams(@RequestParam("max") long max, @RequestParam("count") int count) {
		return "My count = " + count + " My max = " + max;
	}

	@RequestMapping("/hello/{firstName}/{lastName}")
	@ResponseBody
	private String helloRequestParams(@PathVariable("firstName") String firstName,
			@PathVariable("lastName") String lastName) {
		return "Witaj " + firstName + " " + lastName;
	}

	@GetMapping("/form")
	private String getForm() {
		return "form";
	}

	@PostMapping("/form")
	@ResponseBody
	private String postForm(@RequestParam("paramName") String paramName) {
		return "parametr: " + paramName;
	}
}
