package spring._import.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import spring._import.compent.Dog;
import spring._import.importselect.MyBeanDefinitionRegistrar;
import spring._import.importselect.MyImportSelecter;

/**
 *	通过@Import 向容器中导入组件
 *
 *  <p>与 @Bean 和 @ComponentScan+@Controller/@Service/@Repository 的区别在于：
 *  <p>{@link org.springframework.context.annotation.Bean @Bean} 适用于向容器中导入第三方的组件。
 *	<p>{@link org.springframework.context.annotation.ComponentScan @ComponentScan} +
 *	{@link  org.springframework.stereotype.Controller @Controller}/{@link  org.springframework.stereotype.Service @Service}/
 *	{@link  org.springframework.stereotype.Repository @Repository} 适用于自己实现的组件。
 *	<p>{@link Import @Import} 可以直接导入第三方组件，也可以通过全类名路径导入组件，
 *	其中配合{@link org.springframework.context.annotation.ImportSelector ImportSelector} 导入的组件id为全类名路径，
 *	配合{@link org.springframework.context.annotation.ImportBeanDefinitionRegistrar ImportBeanDefinitionRegistrar} 可以指定bean名称。
 *
 * @description: 配置类
 * @author: lsj
 * @create: 2019-10-12 20:23
 **/
@Configuration
@Import(value = {Dog.class, MyImportSelecter.class, MyBeanDefinitionRegistrar.class})
public class Config {
}
