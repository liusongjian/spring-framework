package spring.factorybean.factory;

import org.springframework.beans.factory.FactoryBean;
import spring.factorybean.compent.Car;

/**
 * @description:
 * @author: lsj
 * @create: 2019-10-13 11:48
 **/
public class CarFactoryBean implements FactoryBean<Car> {

	@Override
	public Car getObject() throws Exception {
		return new Car();
	}


	@Override
	public Class<?> getObjectType() {
		return Car.class	 ;
	}


	@Override
	public boolean isSingleton() {
		return false;
	}
}
