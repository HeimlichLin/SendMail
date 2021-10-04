package idv.heimlich.SendMail.common.db;

public interface IDBSessionFactory {

	IDBSession getXdaoSession(String conn);

}
