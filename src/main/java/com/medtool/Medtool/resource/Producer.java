package com.medtool.Medtool.resource;



import com.medtool.Medtool.model.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Producer {
    @Autowired
    private JmsTemplate jmsTemplate;

    @GetMapping("publish/{msg}")
    public String publish(@PathVariable("msg") final String msg){

        jmsTemplate.convertAndSend("mailbox",
                new Email("xuplanozes@gmail.com", "Teste de mensagem JMS!"));


        return "Your message2 <b>"+msg+"</b> published successfully";
    }


}