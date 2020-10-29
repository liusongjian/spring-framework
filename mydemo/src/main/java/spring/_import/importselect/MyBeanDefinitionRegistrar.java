package spring._import.importselect;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import spring._import.compent.Person;

/**
 * @description:
 * @author: lsj
 * @create: 2019-10-12 21:49
 **/
public class MyBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Person.class);
		registry.registerBeanDefinition("person",rootBeanDefinition);
	}
}
