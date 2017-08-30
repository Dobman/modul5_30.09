package pl.coderslab.controller;

import java.util.Calendar;
import java.util.TimeZone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FreeTimeController {

	@RequestMapping("/free-time")
	@ResponseBody
	public String freeTime() {
		return getStatus();
	}

	private Calendar getCalendar() {
		Calendar c = Calendar.getInstance();
		c.setTimeZone(TimeZone.getTimeZone("Europe/Warsaw"));
		return c;
	}

	private String getStatus() {
		Calendar c = getCalendar();
		String status = "";
		if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			status = "Wolne";
		} else {
			if (c.get(Calendar.HOUR_OF_DAY) >= 9 && c.get(Calendar.HOUR_OF_DAY) < 18) {
				status = "Pracuje, nie dzwoń.";
			} else {
				status = "Po Pracy";
			}
		}
		return status;
	}
}
