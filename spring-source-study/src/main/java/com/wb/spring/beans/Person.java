package com.wb.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;

/**
 * @author wangbin33
 * @date Created in 12:56 2019/11/30
 */
public class Person implements ApplicationContextAware, BeanNameAware {
	private String uuid;

	public void sayHello(String name) {
		System.out.println("sayHello daicanshu");
	}

	private final String sayHello() {
		System.out.println("sayHello budaicanshu");
		return "WangBin";
	}

	public Person() {
		System.out.println("Person create ...");
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@PostConstruct
	public void initPerson() {
		System.out.println("initPerson......");
	}

	@Override
	public String toString() {
		return "Person{" +
				"uuid='" + uuid + '\'' +
				'}';
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}

	@Override
	public void setBeanName(String name) {
		System.out.println("BeanName:"+ name);
	}
}
