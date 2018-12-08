package drivers;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import drivers.SqlConnection;
import domains.Deliverable;
import drivers.DeliverableDAO;
import domains.Requirement;
import drivers.RequirementDAO;


public class DBController {

	public static void main(String[] args) throws IOException {
		
		SqlSessionFactory factory = SqlConnection.getSessionFactory();
		SqlSession session = factory.openSession();
		
		
		session.close();
		IOController.closeInput();
	}

}
