package spring.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.autowired.config.Config;
import spring.autowired.service.MyService;

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
		MyService bean = ctx.getBean(MyService.class);
		System.out.println(bean.toString());
	}
}
