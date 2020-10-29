package spring.profiles.config;

import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;
import spring.profiles.compent.Person;


@Configuration
@PropertySource(value = {"classpath:person.properties"},ignoreResourceNotFound=true)
public class Config implements EmbeddedValueResolverAware {

	private String name;

	@Bean
	@Profile("dev")
	public Person persondev() {
		return new Person();
	}

	@Bean
	@Profile("pro")
	public Person personpro() {
		return new Person(name);
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		this.name = resolver.resolveStringValue("${person.last}");
	}
}
