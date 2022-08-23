package com.wb.spring.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

public class BeansTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
		ClassPathXmlApplicationContext acx = new ClassPathXmlApplicationContext("beans.xml");
		//AnnotationConfigApplicationContext acx1 = new AnnotationConfigApplicationContext(BeanConfig.class);
		//acx.getBean(Person.class);
		Person person = (Person) acx.getBean("person");
		System.out.println(person);

		//反射--------三种获取class的方式
//		Class<Person> clazz;
//		clazz = (Class<Person>) Class.forName("com.wb.spring.beans.Person");
//		clazz = (Class<Person>) person.getClass();
//		clazz = Person.class;
//		Constructor<Person> constructor = clazz.getConstructor();
//		Object object = constructor.newInstance();
//		//System.out.println(object);
//		System.out.println(Arrays.toString(clazz.getFields()));
//		System.out.println(Arrays.toString(clazz.getMethods()));
//		for(Method method :clazz.getMethods()){
//			System.out.println(Arrays.toString(method.getAnnotations()));
//		}
//		System.out.println(Arrays.toString(clazz.getAnnotations()));



//		AnnotationConfigApplicationContext acx1 = new MyApplicationContext();
//		//AnnotationConfigApplicationContext acx1 = new AnnotationConfigApplicationContext();
//		acx1.register(BeanConfig.class);
//		acx1.refresh();
//		Object person = acx1.getBean("person");
//		//Object person2 = acx1.getBean("&person");
//		System.out.println(person);
		//System.out.println(person2.getClass());
//		acx.close();


//		ApplicationContext acx = new AnnotationConfigApplicationContext(BeanConfig.class);

//		Object obj1 = acx.getBean("iceCream");
//		Object obj2 = acx.getBean("ice");
//		Object obj3 = acx.getBean("creamy");
//
//		System.out.println(obj1);
//		System.out.println(obj2);
//		System.out.println(obj3);

//		Object person = acx.getBean("person");
//		System.out.println(person);


//		Object obj = acx.getBean("colorFactoryBean");
//		Object obj1 = acx.getBean("&colorFactoryBean");
//
//		Class clazz = obj.getClass();
//		Class clazz1 = obj1.getClass();
//
//
//		System.out.println("colorFactoryBean的类型为：" + clazz);
//		System.out.println("colorFactoryBean的类型为：" + clazz1);
	}
}
