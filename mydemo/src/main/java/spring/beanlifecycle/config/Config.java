package spring.beanlifecycle.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring.beanlifecycle.compent.Book;
import spring.beanlifecycle.compent.Car;
import spring.beanlifecycle.compent.Person;
import spring.beanlifecycle.postprocessor.MyBeanPostProcessor;

/**
 * @description: 配置类
 * @author: lsj
 * @create: 2019-10-12 20:23
 **/
@Configuration
//@ComponentScan(basePackages = "spring.beanlifecycle")
public class Config {
	// 1. 实现类的初始化及销毁接口 InitializingBean, DisposableBean
	// 2. 指定原型模式 （容器启动的时候，bean是不会被创建的而是在获取bean的时候被创建，而且bean的销毁不受IOC容器的管理）
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public Person person(){
		return new Person();
	}
	// 指定Bean的初始化及销毁方法
	@Bean(initMethod = "init",destroyMethod = "destroy")
	public Car car(){
		return new Car();
	}
	// JSR250 规范的类初始化及销毁注解 @PostConstruct @PerDestroy
	@Bean
	public Book book(){
		return new Book();
	}
	// bean的后置处理器会拦截所有bean创建过程
	@Bean
	public MyBeanPostProcessor myBeanPostProcessor(){
		return new MyBeanPostProcessor();
	}
}
