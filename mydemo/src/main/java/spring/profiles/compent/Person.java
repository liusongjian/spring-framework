package spring.profiles.compent;

/**
 * @description: Bean
 * @author: lsj
 * @create: 2019-10-10 22:06
 **/
public class Person {
	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
