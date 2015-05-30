package com.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// ------------------------ USING XML Dependency Injection
		ApplicationContext contex = new ClassPathXmlApplicationContext(
				"Beans.xml");
		TeamAwesome team = (TeamAwesome) contex.getBean(TeamAwesome.class);
		System.out.println(team.rescue());

		// ------------------------- USING ANNOTATION Dependency Injection
		TeamAwesome2 team2 = (TeamAwesome2) contex.getBean(TeamAwesome2.class);
		System.out.println(team2.rescue());

		// ------------------------- USING JAVA BASED ANNOTATION for Dependency Injection
		ApplicationContext context2 = new AnnotationConfigApplicationContext(
				MyConfiguration.class);
		TeamAwesome3 team3 = (TeamAwesome3) context2.getBean(TeamAwesome3.class);
		System.out.println(team3.rescue());

	}
}
