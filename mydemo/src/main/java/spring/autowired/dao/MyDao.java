package spring.autowired.dao;

import javax.annotation.Resource;
import java.util.StringJoiner;

/**
 * @description: 被扫描测试类
 * @author: lsj
 * @create: 2019-10-12 20:14
 **/
public class MyDao {
	public MyDao(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", MyDao.class.getSimpleName() + "[", "]")
				.add("flag='" + flag + "'")
				.toString();
	}

	private String flag;

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
}
