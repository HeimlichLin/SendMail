package idv.heimlich.BaseProject;

import org.slf4j.Logger;

import idv.heimlich.SendMail.common.db.IDBSession;
import idv.heimlich.SendMail.common.db.IDBSessionFactory;
import idv.heimlich.SendMail.common.db.impl.DBSessionFactoryImpl;
import idv.heimlich.SendMail.common.log.LogFactory;

public class Test {
	
	private static Logger LOGGER = LogFactory.getInstance();
	
	public static void main(String[] args) {
		LOGGER.debug("Test Start");
		IDBSessionFactory sessionFactory = new DBSessionFactoryImpl();
		IDBSession session = sessionFactory.getXdaoSession("");
		
	}

}
