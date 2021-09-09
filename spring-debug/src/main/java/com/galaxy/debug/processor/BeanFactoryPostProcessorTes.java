package com.galaxy.debug.processor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * BeanFactoryPostÕÿ’π
 * @author galaxy
 * @since 2021/9/9 7:24
 */
public class BeanFactoryPostProcessorTes {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext-processor.xml");
		System.out.println(applicationContext);
	}
}
