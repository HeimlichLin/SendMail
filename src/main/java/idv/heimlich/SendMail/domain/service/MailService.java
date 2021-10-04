package idv.heimlich.SendMail.domain.service;

import idv.heimlich.SendMail.domain.dto.impl.MailCreateDTO;

public interface MailService {
	
	String create(MailCreateDTO mailCreateDTO);

	void send();

}
