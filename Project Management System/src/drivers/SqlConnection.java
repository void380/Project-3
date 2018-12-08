package drivers;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlConnection {
	private static SqlConnection sqlFactory = null;
	private static SqlSessionFactory sessionFactory = null;

	private SqlConnection() {}

	private static SqlConnection getInstance() throws IOException {
		String resource = null;
		Reader reader = null;

		if(sqlFactory == null) {
			resource = "resource/mybatis-config.xml";
			reader = Resources.getResourceAsReader(resource);
			
			sqlFactory = new SqlConnection();
			sqlFactory.sessionFactory = new SqlSessionFactoryBuilder().build(reader);
		}
		
		return sqlFactory;
	}

	public static synchronized SqlSessionFactory getSessionFactory() throws IOException {
		if(sqlFactory == null) {
			getInstance();
		}
		
		return sessionFactory;
	}

	public Object clone() throws CloneNotSupportedException {
	 	throw new CloneNotSupportedException();
	}
}
