package spring.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.scope.compent.Car;
import spring.scope.compent.Person;
import spring.scope.config.Config;

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
		Person p1 = (Person) ctx.getBean("person");
		Person p2 = (Person) ctx.getBean("person");
		System.out.println("person:"+(p1 == p2?"单例":"原型"));

		Car c1 = (Car)ctx.getBean("car");
		Car c2 = (Car)ctx.getBean("car");
		System.out.println("car:"+(c1 == c2?"单例":"原型"));

	}
}
