package spring.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.value.Config;

/**
 * @description: 包扫描测试启动类
 * @author: lsj
 * @create: 2019-10-10 22:00
 **/
public class StartClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
		Person bean = ctx.getBean(Person.class);
		System.out.println(bean.toString());

	}
}
