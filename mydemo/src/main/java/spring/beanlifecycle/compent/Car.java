package spring.beanlifecycle.compent;

/**
 * @description:
 * @author: lsj
 * @create: 2019-10-12 20:28
 **/
public class Car {
	public Car() {
		System.out.println("Car 构造方法");
	}
	public void init(){
		System.out.println("Car的初始化方法 -> init @Bean initMethod");
	}
	public void destroy(){
		System.out.println("Car的销毁方法 -> destroy @Bean destroyMethod");
	}
}
