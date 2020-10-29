package spring.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @description: BeanFactoryPostProcessor调用时机：Bean定义加载到容器后 Bean被实例化前
 * @author: lsj
 * @create: 2019-10-14 22:48
 **/
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("IOC容器调用了MyBeanFactoryPostProcessor#postProcessBeanFactory方法");
		for (String beanDefinitionName : beanFactory.getBeanDefinitionNames()) {
//			System.out.println(beanDefinitionName);
			if ("person".equals(beanDefinitionName)){
				BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
				beanDefinition.setLazyInit(true);
			}
		}
	}
}
