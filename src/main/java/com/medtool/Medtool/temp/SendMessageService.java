package com.medtool.Medtool.temp;

import com.medtool.Medtool.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

public class SendMessageService {

    @Autowired
    private JmsTemplate jmsTemplate;


    public void sendTest() {

        System.out.println("Sending an email message.");

        jmsTemplate.convertAndSend("mailbox", new Email("xuplanozes@gmail.com", "Hello"));
    }
}