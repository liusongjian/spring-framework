package spring.beanlifecycle.compent;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @description:
 * @author: lsj
 * @create: 2019-10-13 13:00
 **/
public class Book {
	public Book() {
		System.out.println("Book 构造方法");
	}

	@PostConstruct
	public void init() {
		System.out.println("Book -> init JSR250 PostConstruct");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("Book的销毁方法 -> destroy JSR250 PreDestroy");
	}
}
