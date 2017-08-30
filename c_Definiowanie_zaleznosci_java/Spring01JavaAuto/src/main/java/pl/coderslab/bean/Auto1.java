package pl.coderslab.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dupa")
public class Auto1 {
	public String getValue() {
		return "Auto1 value";
	}
}
