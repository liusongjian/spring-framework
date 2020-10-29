package spring.beanfactorypostprocessor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

		System.out.println("该Bean在BeanFactory后置处理器中被修改为懒加载：");
		Person bean = ctx.getBean(Person.class);
		System.out.println(bean.toString());

	}
}
