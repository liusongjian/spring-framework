package spring.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;

/**
 * @description: Bean
 * @author: lsj
 * @create: 2019-10-10 22:06
 **/

public class Person {
	public Person() {
		System.out.println("Person 构造方法");
	}
	@Value("tom")
	private String name;

	@Value("#{28-8}")
	private Integer age;
	@Value("${person.last}")
	private String last;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.add("age=" + age)
				.add("last='" + last + "'")
				.toString();
	}
}
