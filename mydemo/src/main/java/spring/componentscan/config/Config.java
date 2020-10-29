package spring.componentscan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring.componentscan.compent.Person;
import spring.componentscan.filtertype.MyFilterType;

/**
 * {@link ComponentScan @ComponentScan}与{@link Bean @Bean}都是向IOC容器添加组件方式之一，
 * 同样有{@link spring._import.config.Config @Import}方式。
 *
 * @author: lsj
 * @create: 2019-10-10 22:04
 **/
@Configuration
@ComponentScan(basePackages = {"spring.componentscan"},
//		excludeFilters = {
//		@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Service.class),
//		@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = MyController.class)
//},
		includeFilters = {
				@ComponentScan.Filter(type = FilterType.CUSTOM, value = MyFilterType.class)
		},
		useDefaultFilters = false)
public class Config {
	@Bean
	public Person person() {
		return new Person();
	}
}
