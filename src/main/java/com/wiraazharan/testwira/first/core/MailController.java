package com.wiraazharan.testwira.first.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wiraazharan.testwira.first.mail.MailSender;
import com.wiraazharan.testwira.first.mail.MockMailSender;

@RestController
public class MailController {
	
	private MailSender mailsender = new MockMailSender();
	
	@RequestMapping("/mail")
	public String sendMail(){
		
		mailsender.Send("wira azharan", "hello", "Everybody");
		return "MailSend";
	}

}
