package org.richardliao.mq;

import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	AlertService sender = context.getBean(AlertService.class);
	sender.sendMessage("Hello world!!");
    }
}
