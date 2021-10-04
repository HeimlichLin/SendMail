package idv.heimlich.SendMail.domain.controller.job.mail;

import idv.heimlich.SendMail.domain.service.MailService;
import idv.heimlich.SendMail.domain.service.impl.MailServiceImpl;

public class SendMailJob {
	
	private MailService mailService = MailServiceImpl.get();

	public void doSend() {
		this.mailService.send();
	}
	
}
