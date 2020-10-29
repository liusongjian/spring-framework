package spring.beanlifecycle.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 *
 * @description: 后置处理器
 * @author: lsj
 * @create: 2019-10-13 12:45
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor ---> postProcessBeforeInitialization beanName:"+ beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyBeanPostProcessor ---> postProcessAfterInitialization beanName:"+ beanName);
		return bean;
	}
}
