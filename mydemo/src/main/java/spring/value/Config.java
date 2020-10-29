package spring.value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import spring.value.Person;

/**
 * @description: 配置类
 * @author: lsj
 * @create: 2019-10-12 20:23
 **/
@Configuration
@PropertySource(value = {"classpath:person.properties"},ignoreResourceNotFound=true)
public class Config {
	@Bean
	public Person person(){
		return new Person();
	}

}
