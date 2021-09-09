package com.galaxy.debug.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.lang.NonNull;

/**
 * 自定义BeanFactoryPostProcessor
 * @author galaxy
 * @since 2021/9/9 7:46
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(@NonNull ConfigurableListableBeanFactory beanFactory) throws BeansException {
		BeanDefinition user = beanFactory.getBeanDefinition("user");
		System.out.println(user);
	}
}
