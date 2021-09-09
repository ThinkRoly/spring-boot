package com.galaxy.debug.experience;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring初体验
 * @author galaxy
 * @since 2021/8/21 10:53
 */
public class ExperienceTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-experience.xml");
		User user = applicationContext.getBean(User.class);
		System.out.println(user);
		//git config --global core.longpaths true
	}
}
