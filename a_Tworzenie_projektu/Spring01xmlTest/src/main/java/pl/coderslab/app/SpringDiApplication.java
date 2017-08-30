package pl.coderslab.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.coderslab.bean.HelloWorld;
import pl.coderslab.bean.MessageSender;

public class SpringDiApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		HelloWorld hw = context.getBean("helloWorld", HelloWorld.class);
		System.out.println(hw.getMessage());
		
		MessageSender ms = context.getBean("messageSender", MessageSender.class);
		ms.sendMessage();
		
		context.close();
	}

}
