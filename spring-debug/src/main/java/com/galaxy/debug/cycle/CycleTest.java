package com.galaxy.debug.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 循环依赖入口
 * @author galaxy
 * @since 2021/8/21 8:29
 */
public class CycleTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-cycle.xml");
		User user = applicationContext.getBean(User.class);
		System.out.println(user.getName());
	}
}
