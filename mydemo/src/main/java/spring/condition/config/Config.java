package spring.condition.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import spring.condition.compent.MyAspect;
import spring.condition.compent.MyLog;
import spring.condition.condition.MyCondition;

/**
 * @description: 配置类
 * @author: lsj
 * @create: 2019-10-12 20:23
 **/
@Configuration
public class Config {
	/**
	 * 设置@Bean的name值或者改变myAspect方法名
	 * 都会导致@Conditional条件判断为false myLog无法被加载到Spring容器
 	 */
	@Bean
	public MyAspect myAspect(){
		return new MyAspect();
	}

	/**
	 * 注解@Conditional 用于判断@Bean是否被加载
	 */
	@Bean
	@Conditional(value = MyCondition.class)
	public MyLog myLog(){
		return new MyLog();
	}
}
