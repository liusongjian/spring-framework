package spring.condition.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @description:
 * @author: lsj
 * @create: 2019-10-12 21:23
 **/
public class MyCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// ioc使用的BeanFactory
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		// 获取类加载器
		ClassLoader classLoader = context.getClassLoader();
		// 获取Bean定义注册类
		BeanDefinitionRegistry registry = context.getRegistry();
		// 获取当前环境
		Environment environment = context.getEnvironment();
		// 获取资源加载器
		ResourceLoader resourceLoader = context.getResourceLoader();
		// 判断容器是否存在对应myAspect组件
		return beanFactory.containsBean("myAspect");
	}
}
