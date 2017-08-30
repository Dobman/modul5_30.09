package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.coderslab.bean.Auto2;
import pl.coderslab.config.AppConfig;

public class SpringDiApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Auto2 auto2 = context.getBean(Auto2.class);
		System.out.println(auto2.getAuto1().getClass().getName());
	}

}
