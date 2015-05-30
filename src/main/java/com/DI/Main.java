package com.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// ------------------------ USING XML Dependency Injection
		// ---------------------------
		ApplicationContext contex = new ClassPathXmlApplicationContext(
				"Beans.xml");
		TeamAwesome team = (TeamAwesome) contex.getBean(TeamAwesome.class);

		System.out.println(team.rescue());

		// ------------------------- USING ANNOTATION Dependency Injection
		// ---------------------

		TeamAwesome2 team2 = (TeamAwesome2) contex.getBean(TeamAwesome2.class);

		System.out.println(team.rescue());
		
		
	}
}
