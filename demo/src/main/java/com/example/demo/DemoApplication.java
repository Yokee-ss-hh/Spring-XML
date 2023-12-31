package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		ApplicationContext c1 = new ClassPathXmlApplicationContext("com/example/demo/StudentConfig.xml");
		Student s1 = (Student) c1.getBean("student1");
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.toString());
		
		ApplicationContext c2 = new ClassPathXmlApplicationContext("com/example/demo/StudentConfig.xml");
		Student s2 = (Student) c2.getBean("student2");
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.toString());
		
		ApplicationContext c3 = new ClassPathXmlApplicationContext("com/example/demo/StudentConfig.xml");
		Student s3 = (Student) c3.getBean("student3");
		System.out.println(s3.getName());
		System.out.println(s3.getAge());
		System.out.println(s3.toString());
		
		ApplicationContext c4 = new ClassPathXmlApplicationContext("com/example/demo/PersonConfig.xml");
		Person p1 = (Person) c4.getBean("person1"); 
		System.out.println(p1.getName());
		System.out.println(p1.getFavoritePlaces());
		System.out.println(p1.getFriends());
		System.out.println(p1.getHobbies());
		System.out.println(p1.getProps());
		System.out.println(p1.toString());
		
		ApplicationContext c5 = new ClassPathXmlApplicationContext("com/example/demo/AB.xml");
		A aObject = (A) c5.getBean("beanA");
		B bObject = (B) c5.getBean("beanB");
		System.out.println(aObject.getA());
		System.out.println(aObject.getbObj());
		System.out.println(bObject.getB());
		
		B bObject1 = (B) c5.getBean("bean2B");
		A aObject1 = (A) c5.getBean("bean2A");
		System.out.println(bObject1.getB());
		System.out.println(aObject1.getA());
		System.out.println(aObject1.getbObj());
		
		ApplicationContext c6 = new ClassPathXmlApplicationContext("com/example/demo/PostComment.xml");
		Comment comment1 = (Comment) c6.getBean("commentBean1");
		Comment comment2 = (Comment) c6.getBean("commentBean2");
		Comment comment3 = (Comment) c6.getBean("commentBean3");
		Post post1 = (Post) c6.getBean("postBean1");
		Post post2 = (Post) c6.getBean("postBean2");
		Post post3 = (Post) c6.getBean("postBean3");
		System.out.println(comment1.commentId);
		System.out.println(comment1.commentName);
		System.out.println(comment2.commentId);
		System.out.println(comment2.commentName);
		System.out.println(comment3.commentId);
		System.out.println(comment3.commentName);
		System.out.println(post1.postId);
		System.out.println(post1.postName);
		System.out.println(post1.postComment);
		System.out.println(post2.postId);
		System.out.println(post2.postName);
		System.out.println(post2.postComment);
		System.out.println(post3.postId);
		System.out.println(post3.postName);
		System.out.println(post3.postComment);
		
		ApplicationContext c7 = new ClassPathXmlApplicationContext("com/example/demo/Ambiguity.xml");
		Ambiguity a = (Ambiguity) c7.getBean("Amb");
		System.out.println(a.a);
		System.out.println(a.b);
		
		// close() method is available in AbstractApplicationContext so we are using this class
		AbstractApplicationContext c8 = new ClassPathXmlApplicationContext("com/example/demo/BeanLifeCycle1.xml");
		BeanLifeCycle1 b1 = (BeanLifeCycle1) c8.getBean("bean1");
		System.out.println(b1.toString());
		c8.close();
		
		AbstractApplicationContext c9 = new ClassPathXmlApplicationContext("com/example/demo/BeanLifeCycle2.xml");
		BeanLifeCycle2 b2 = (BeanLifeCycle2) c9.getBean("bean2");
		System.out.println(b2.toString());
		c9.close();
		
		AbstractApplicationContext c10 = new ClassPathXmlApplicationContext("com/example/demo/BeanLifeCycle3.xml");
		BeanLifeCycle3 b3 = (BeanLifeCycle3) c10.getBean("bean3");
		System.out.println(b3.toString());
		System.out.println(b3.getColor());
		c10.close();
		
		// Auto wiring is the process of injecting dependency to reference types at runtime 
		// Auto wiring can be done in 2 ways. (i) XML based (ii) Annotation based 
	    // XML based can be done in 5 modes
		// 1) no mode 2) byName mode 3) byType mode 4) constructor mode 5) autodetect mode 
		// no mode is default auto wiring mode, that means there is no autowiring 
		// byName mode checks any bean with name as reference field in the class, Internally calls setter method while setting data
		// byType mode checks any bean with type as reference field in the class, Internally calls setter method while setting data 
		
		// 1) byName:
		// In "EmployeeAndAddress.xml" file, A bean with name "employeeAddress" is matching with a bean with name as "employeeAddress"
		// So, Spring injects that bean into the bean with name "employee1"
		// If the name of field "employeeAddress" in Employee class does not match with any bean name in xml file, the 
		// value of "employeeAddress" field will be set to "null"
		// If 2 beans with names as reference field in a class, Spring throws exception as "A bean with the name is already in use" 
		// byName -> uses setter to inject dependency
		ApplicationContext c11 = new ClassPathXmlApplicationContext("com/example/demo/EmployeeAndAddressByName.xml");
		Employee e1 = (Employee) c11.getBean("employee1");
		System.out.println(e1.getEmployeeName());
		System.out.println(e1.getEmployeeAddress());
		
		// 2) byType:
		// Spring checks beans which are of type "employeeAddress" which is "Address". 
		// If 2 or more beans are available in xml file, Spring throws below error
		// No qualifying bean of type 'com.example.demo.Address' available: expected single matching bean but found 2: employeeAddress1,employeeAddress2
		// So, When using "byType" mode always make sure to have 1 bean of type "Employee" in xml file
		// No need of matching bean name with variable name which needs the dependency to be injected 
		// That means no need to create bean of type Address with name as "employeeAddress" 
		// byType -> uses setter to inject dependency
		ApplicationContext c12 = new ClassPathXmlApplicationContext("com/example/demo/EmployeeAndAddressByType.xml");
		Employee e2 = (Employee) c12.getBean("employee2");
		System.out.println(e2.getEmployeeName());
		System.out.println(e2.getEmployeeAddress());
     	// 3) constructor:
		// If there are overloaded constructors, spring calls constructor with more parameters
		// Note: If we opt for constructor mode in bean, We need to constructor based value setting instead of 
		// property bases value setting
		// constructor -> uses constructor to inject dependency
		ApplicationContext c13 = new ClassPathXmlApplicationContext("com/example/demo/EmployeeAndAddressConstructor.xml");
		Employee e3 = (Employee) c13.getBean("employee3");
		System.out.println(e3.getEmployeeName());
		System.out.println(e3.getEmployeeAddress());
		
		// Autowired Annotation: 
		// Can be used to inject dependency on reference types in 3 ways
		// 1) Autowired annotated on reference field -> equivalent to using autowire="byType" in bean in xml file
		// 2) On setter method -> equivalent to using autowire="byType" in bean in xml file
		// 3) On constructor -> equivalent to using autowire="constructor" in bean in xml file 
		// We are using "AutoWiredMain" class and inject it's dependency objects of "AutoWired1", "AutoWired2", "AutoWired3" objects
		
		ApplicationContext c14 = new ClassPathXmlApplicationContext("com/example/demo/AutoWired.xml");
		AutoWiredMain aw = (AutoWiredMain) c14.getBean("xyz");
		System.out.println(aw.getWired1()); // Injected using @Autowired on reference field
		System.out.println(aw.getWired2()); // Injected using @Autowired on setter method
		System.out.println(aw.getWired3()); // Injected using @Autowired on constructor
		
		// Qualifier Annotation:
		// If 2 or more beans for same class is present in xml file. Then, Spring don't know which bean 
		// to use to inject dependency into the Autowired reference. So, We need to use Qualifier Annotation 
		// to provide the required bean name. 
		// If we don't use Qualifier annotation we will get below message
		// No qualifying bean of type 'com.example.demo.Qualifier1' available: expected single matching bean but found 2: quali1,quali2
		// To remove above exception, use @Qualifier("bean name") Annotation
		
		ApplicationContext c15 = new ClassPathXmlApplicationContext("com/example/demo/QualifierMain.xml");
		QualifierMain qm = (QualifierMain) c15.getBean("qualimain");
		System.out.println(qm.getQ1());
		System.out.println(qm.toString());
		
		// Spring stand alone collections using Util Schema:
		// If we use list,set and map tags inside property/ constructor-arg tags to inject data we need to re-write 
		// list/set/map tags with data everytime we create multiple beans. 
		// That means if we have multiple beans and we want to set common list data, Then we need to use list tag in all of
		// the multiple beans, This is code duplication. We can set list at single time and re-use that by calling 
		// inside multiple beans using ref tag and create stand alone collections using util schema
		// We can use util schema to set list/set/map at single time and can these using "ref" attribute in multiple 
		// beans
		// By default, list tag uses ArrayList, set uses HashSet and map uses HashMap. But using util schema 
		// we can specify which class we want to use.
		
		ApplicationContext c16 = new ClassPathXmlApplicationContext("com/example/demo/StandAloneCollectionsUtilSchema.xml");
		StandAloneCollectionsUtilSchema sacus1 = (StandAloneCollectionsUtilSchema) c16.getBean("s1");
		StandAloneCollectionsUtilSchema sacus2 = (StandAloneCollectionsUtilSchema) c16.getBean("s2");
		
		System.out.println(sacus1.getBurgerPrices());
		System.out.println(sacus1.getFavoritePlaces());
		System.out.println(sacus1.getFavoritePrimes());
		System.out.println(sacus1.getProps());
		System.out.println(sacus1.getBurgerPrices().getClass().getName());
		System.out.println(sacus1.getFavoritePlaces().getClass().getName());
		System.out.println(sacus1.getFavoritePrimes().getClass().getName());
		System.out.println(sacus1.getProps().getClass().getName());
		
		System.out.println(sacus2.getBurgerPrices());
		System.out.println(sacus2.getFavoritePlaces());
		System.out.println(sacus2.getFavoritePrimes());
		System.out.println(sacus2.getProps());
		System.out.println(sacus2.getBurgerPrices().getClass().getName());
		System.out.println(sacus2.getFavoritePlaces().getClass().getName());
		System.out.println(sacus2.getFavoritePrimes().getClass().getName());
		System.out.println(sacus2.getProps().getClass().getName());
		
		// Here in this project we have only 1 entry point to the spring boot application with name as
		// DemoApplication which is annotated by @SpringBootApplication which internally annotated by
		// @Configuration, @ComponentScan ....etc 
		// If i create a xml file to specify spring to scan a package using <context:component-scan/> 
		// and that class has a @Component annotation, and use that class to create object in main class using
		// ApplicationContext. We will get 2 objects because, 1 object will be created by main class as main class
		// is annotated with @ComponentScan internally. Another object will be created by XML file as we 
		// mentioned <context:component-scan/> in it. So 2 objects of same class is disallowed here. 
		// We cannot create a object of a class that is annotated with @Component using ApplicationContext
		// in main class DemoApplication.java because ApplicationContext uses xml file which has <context:component-scan/> in it 
		// and DemoApplication.java class has @SpringBootApplication annotated which internally uses @ComponentScan
		// So 2 times scanning will happen.
		// This creates 2 times scanning of java class annotated with @Component which creates 2 objects which
		// is not allowed
		// So, We need to run our application as a java application without single entry point annotated with
		// @SpringBootApplication. Hence @Component, @Value feature demo with package scanning via XML file
		// is covered in another project. 
	}
}
