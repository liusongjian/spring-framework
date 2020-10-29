package spring.applicationlistener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: lsj
 * @create: 2019-10-14 22:17
 **/
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("MyApplicationListener接收到事件"+event);
	}
}
