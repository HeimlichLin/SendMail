package idv.heimlich.SendMail.domain.service;

import idv.heimlich.SendMail.domain.code.GetNumberType;

public interface GetNumberService {
	
	/**
	 * 取號
	 */
	public String getCount(GetNumberType getNumberType, String... codes);

}
