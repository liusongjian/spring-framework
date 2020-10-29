package spring.factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.factorybean.compent.Car;
import spring.factorybean.config.Config;
import spring.factorybean.factory.CarFactoryBean;

/**
 * @description: 配置启动主函数
 * @author: lsj
 * @create: 2019-10-13 11:59
 **/
public class StartClass {
	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
			System.out.println(beanDefinitionName);
		}
		// 获取Bean
		Object fb1 = ctx.getBean("carFactoryBean");
		System.out.println("getBean -> carFactoryBean:"+fb1.getClass());
		// 获取对应的FactoryBean
		Object fb2 = ctx.getBean("&carFactoryBean");
		System.out.println("getBean -> &carFactoryBean:"+fb2.getClass());
		// 获取对应FactoryBean
		CarFactoryBean carFactoryBean = ctx.getBean(CarFactoryBean.class);
		Car object = carFactoryBean.getObject();
	}
}