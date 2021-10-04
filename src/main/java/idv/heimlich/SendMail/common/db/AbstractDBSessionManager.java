package idv.heimlich.SendMail.common.db;

import idv.heimlich.SendMail.common.db.impl.DBSessionImpl;

public abstract class AbstractDBSessionManager {
	
	private static IDBSession dbSession;
	
	public IDBSession getDBSession() {
		if (dbSession == null) {
			dbSession = new DBSessionImpl();
		}
		return dbSession;
	}
	
	protected abstract String getConnId();

}
