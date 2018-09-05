package org.richardliao.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.MessageCreator;

public class AlertServiceImpl implements AlertService {
    private JmsOperations jmsOperations;

    @Autowired
    public AlertServiceImpl(JmsOperations jmsOperations) {
	this.jmsOperations = jmsOperations;
    }

    public void sendMessage(final String msg) {
	jmsOperations.send(new MessageCreator() {
			       public Message createMessage(Session session) throws JMSException {
				   return session.createTextMessage(msg);
			       }
			   });
    }
}
