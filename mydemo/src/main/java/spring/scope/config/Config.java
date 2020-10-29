package spring.scope.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import spring.scope.compent.Car;
import spring.scope.compent.Person;

/**
 * @description: 配置类
 * @author: lsj
 * @create: 2019-10-12 20:23
 **/
@Configuration
public class Config {
	@Bean
//	@Lazy
	@Scope(scopeName = "prototype")
	public Person person(){
		return new Person();
	}

	@Bean
	public Car car(){
		return new Car();
	}
}
