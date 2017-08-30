package pl.coderslab.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RandomController {

	@RequestMapping("/random")
	@ResponseBody
	public String showRandom() {
		Random r = new Random();
		int rand = r.nextInt(100) + 1;
		return "Wylosowano liczbe: " + rand;
	}

	@RequestMapping("/random/{min}/{max}")
	@ResponseBody
	public String showRandomMax(@PathVariable(name = "max") int max, @PathVariable(name = "min") int min) {
		Random r = new Random();
		int rand = r.nextInt(max - min + 1);
		return "Uzytkownik podal wartosci " + min + " i " + max + ". Wylosowano liczbe:" + rand;
	}
}
