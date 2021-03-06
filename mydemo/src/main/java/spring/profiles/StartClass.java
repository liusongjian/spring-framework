package spring.profiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.profiles.compent.Person;
import spring.profiles.config.Config;

/**
 * @description: 包扫描测试启动类
 * @author: lsj
 * @create: 2019-10-10 22:00
 **/
public class StartClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("pro");
		ctx.register(Config.class);
		ctx.refresh();
		for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
		System.out.println(ctx.getBean(Person.class).getName());
	}
}
