package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.coderslab.bean.Component2;
import pl.coderslab.bean.HelloWorld;
import pl.coderslab.bean.Scope1;
import pl.coderslab.bean.Scope2;

public class SpringDiApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld hw = context.getBean("helloWorld", HelloWorld.class);
		hw.hello();
		
		Component2 c2 = context.getBean("component2", Component2.class);
		System.out.println(c2.getComponent1().getValue());
		
		Scope1 scope1 = context.getBean(Scope1.class);
		System.out.println(scope1);
		Scope1 scope11 = context.getBean(Scope1.class);
		System.out.println(scope11);
		Scope2 scope2 = context.getBean(Scope2.class);
		System.out.println(scope2);
		Scope2 scope22 = context.getBean(Scope2.class);
		System.out.println(scope22);
	}
}
