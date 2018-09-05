package org.richardliao.mq;

import javax.jms.ConnectionFactory;
import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConnectionFactory cf = new ActiveMQConnectionFactory("tcp://localhost:61616");
        Connection conn = null;
        Session session = null;
        try {
	    conn = cf.createConnection();
	    System.out.println("Start connection...");
	    conn.start();
	    System.out.println("Create session...");
	    session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
	    Destination destination = new ActiveMQQueue("spitter.queue");
	    System.out.println("Create Consumer...");
	    MessageConsumer consumer = session.createConsumer(destination);
	    System.out.println("Waiting message...");
	    Message message = consumer.receive();
	    TextMessage textMessage = (TextMessage) message;
	    System.out.println("Got a message: " + textMessage.getText());
	    //conn.start();
	} catch (JMSException e) {
	    
	} finally {
	    try {
		if (session != null) {
		    session.close();
		}
		if (conn != null) {
		    conn.close();
		}
	    } catch (JMSException e) {
	    }
	    
	}
    }
}
