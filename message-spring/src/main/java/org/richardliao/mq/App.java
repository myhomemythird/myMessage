package org.richardliao.mq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.richardliao.mq.domain.Spittle;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	AlertService sender = (AlertService) context.getBean("alertService");
	sender.sendSpittleAlert(new Spittle(1L, "Hello world!!", new Date()));
    }
}
