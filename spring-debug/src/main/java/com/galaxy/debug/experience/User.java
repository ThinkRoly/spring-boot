package com.galaxy.debug.experience;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author galaxy
 * @since 2021/8/21 10:54
 */
public class User implements BeanNameAware, ApplicationContextAware, EnvironmentAware {

	private String name;

	private Integer age;

	private String beanName;

	private ApplicationContext applicationContext;

	private Environment environment;


	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public void initMethod(){
		if (age == null){
			age = 18;
		}
		System.out.println(" initMethod invoke ...");
	}

	public User (){

	}
	public User (String name, Integer age){
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age=" + age +
				", beanName='" + beanName + '\'' +
				", applicationContext=" + applicationContext +
				", environment=" + environment +
				'}';
	}
}
