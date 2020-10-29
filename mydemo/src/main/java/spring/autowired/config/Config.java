package spring.autowired.config;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.*;
import spring.autowired.dao.MyDao;
import spring.componentscan.compent.Person;
import spring.componentscan.filtertype.MyFilterType;

/**
 *
 * @author: lsj
 * @create: 2019-10-10 22:04
 **/
@Configuration
@ComponentScan(basePackages = {"spring.autowired"})
public class Config {

	@Primary
	@Bean
	public MyDao myDao1(){
		return new MyDao("1");
	}
	@Bean
	public MyDao myDao2(){
		return new MyDao("2");
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public MyDao myDao3(){
		return new MyDao("3");
	}

}
