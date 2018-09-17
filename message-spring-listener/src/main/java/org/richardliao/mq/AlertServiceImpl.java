package org.richardliao.mq;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import org.richardliao.mq.domain.Spittle;

@Component("alertService")
public class AlertServiceImpl implements AlertService {
    private JavaMailSender mailSender;
    private String alertEmailAddress = "myhomemythird@163.com";

    public AlertServiceImpl(JavaMailSender mailSender) {
	this.mailSender = mailSender;
    }

    public void sendSpittleAlert(final Spittle spittle) {
	SimpleMailMessage message = new SimpleMailMessage();
	String spitterName = "Richard";
	message.setFrom("noreply@spitter.com");
	message.setTo(this.alertEmailAddress);
	message.setSubject("New Spittle from" + spitterName);
	message.setText(spitterName + " says: " + spittle.toString());
	mailSender.send(message);
    }
}
