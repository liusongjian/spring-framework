package spring.autowired.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring.autowired.dao.MyDao;

import java.util.StringJoiner;

/**
 * @description: 被扫描类
 * @author: lsj
 * @create: 2019-10-11 19:23
 **/
@Service
public class MyService {
	@Qualifier("myDao3")
	@Autowired(required = false)
	private MyDao myDao;

	@Override
	public String toString() {
		return new StringJoiner(", ", MyService.class.getSimpleName() + "[", "]")
				.add("myDao=" + myDao)
				.toString();
	}
}
