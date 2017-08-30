package pl.coderslab.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Auto2 {
	private Auto1 auto1;
	
	@Autowired
	public Auto2(@Qualifier("dupa")Auto1 auto1) {
		this.auto1 = auto1;
	}
	
	public Auto1 getAuto1() {
		return auto1;
	}
}
