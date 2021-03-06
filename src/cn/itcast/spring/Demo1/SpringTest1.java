package cn.itcast.spring.Demo1;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class SpringTest1 {

	@Test
	//传统的开发
	public void demo1(){
		//造成程序的紧密耦合
		HelloService helloService = new HelloServiceImpl();
		helloService.sayHello();
	}
	
	@Test
	//Spring的开发
	public void demo2(){
		//创建一个工厂类
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		HelloService helloService = (HelloService) applicationContext.getBean("userService");
		helloService.sayHello();
	}
	
	@Test
	//加载磁盘路径下的配置文件
	public void demo3(){
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
				"applicationContext.xml");
		HelloService helloService = (HelloService) applicationContext.getBean("userService");
		helloService.sayHello();
	}
	
	@Test
	public void demo4(){
		//FileSystemResource   ClassPathResource
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
				"applicationContext.xml"));
		HelloService helloService = (HelloService) beanFactory.getBean("userService");
		helloService.sayHello();
	}
	
}
