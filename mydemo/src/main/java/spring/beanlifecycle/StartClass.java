package spring.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.beanlifecycle.compent.Person;
import spring.beanlifecycle.config.Config;


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
		System.out.println("原型模式Bean: Person ... 开始调用");
		Person bean = ctx.getBean(Person.class);
		System.out.println("原型模式Bean: Person ... 结束");
		System.out.println("容器销毁 ...");
		ctx.close();
	}
}
