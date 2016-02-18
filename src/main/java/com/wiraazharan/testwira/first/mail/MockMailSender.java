package com.wiraazharan.testwira.first.mail;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MockMailSender implements MailSender {
	
	public static final Log log = LogFactory.getLog(MockMailSender.class);
	
	
	
	/* (non-Javadoc)
	 * @see com.wiraazharan.testwira.first.mail.MailSender#Send(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void Send(String to, String subject, String body){
		log.info("Sending mail to "+ to);
		log.info("Subject: "+ subject);
		log.info("Body: "+ body);
	}

}
