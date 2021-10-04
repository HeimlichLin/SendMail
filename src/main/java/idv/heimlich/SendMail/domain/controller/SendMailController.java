package idv.heimlich.SendMail.domain.controller;

import idv.heimlich.SendMail.domain.controller.job.mail.SendMailJob;

public class SendMailController {
	
	public static void main(String[] args) {
		new SendMailJob().doSend();
	}

}
