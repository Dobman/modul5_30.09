package pl.coderslab.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Component2 {
	private Component1 component1;

	public Component1 getComponent1() {
		return component1;
	}

	@Autowired
	public void setComponent1(Component1 component1) {
		this.component1 = component1;
	}
}
