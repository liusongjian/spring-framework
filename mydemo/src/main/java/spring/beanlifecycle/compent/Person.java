package spring.beanlifecycle.compent;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @description: Bean
 * @author: lsj
 * @create: 2019-10-10 22:06
 **/
public class Person implements InitializingBean, DisposableBean {
	public Person() {
		System.out.println("Person 构造方法");
	}



	@Override
	public void destroy() throws Exception {
		System.out.println("Person ---> DisposableBean 的 destroy");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Person ---> InitializingBean 的 afterPropertiesSet");
	}
}
