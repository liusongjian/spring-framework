package spring.applicationlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.value.Person;

/**
 * @description: 包扫描测试启动类
 * @author: lsj
 * @create: 2019-10-10 22:00
 **/
public class StartClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
//		for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
//			System.out.println(beanDefinitionName);
//		}
		ctx.publishEvent(new ApplicationEvent("发布一个事件") {
			@Override
			public Object getSource() {
				return super.getSource();
			}
		});
		ctx.close();
	}
}
