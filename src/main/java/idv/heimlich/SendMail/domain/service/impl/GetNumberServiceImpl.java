package idv.heimlich.SendMail.domain.service.impl;

import java.math.BigDecimal;

import idv.heimlich.SendMail.domain.code.GetNumberType;
import idv.heimlich.SendMail.domain.dao.GetNumberDAO;
import idv.heimlich.SendMail.domain.dao.impl.GetNumberDAOImpl;
import idv.heimlich.SendMail.domain.service.GetNumberService;

/**
 * 取號服務
 */
public class GetNumberServiceImpl implements GetNumberService {
	
	private static GetNumberService INSTANCT = new GetNumberServiceImpl();
	private GetNumberDAO getNumberDAO = GetNumberDAOImpl.INSTANCE;

	protected GetNumberServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public static GetNumberService get() {
		return INSTANCT;
	}

	@Override
	public String getCount(GetNumberType getNumberType, String... codes) {
		final String[] codesArray = getNumberType.codes(codes);
		BigDecimal bigDecimal = this.getNumberDAO.getSerialNo(getNumberType.name(), codesArray);
		return getNumberType.getId(codesArray[0], codesArray[1], codesArray[2], bigDecimal);
	}

}
