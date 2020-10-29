package spring.bfpostprocesser;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @description: BeanFactoryPostProcessor调用时机：Bean定义加载到容器后 Bean被实例化前
 * @author: lsj
 * @create: 2019-10-14 22:48
 **/
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("IOC容器调用了MyBeanDefinitionRegistryPostProcessor#postProcessBeanDefinitionRegistry方法");
		System.out.println("Bean定义数量："+registry.getBeanDefinitionCount());
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Person.class);
		registry.registerBeanDefinition("person",rootBeanDefinition);
	}
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
