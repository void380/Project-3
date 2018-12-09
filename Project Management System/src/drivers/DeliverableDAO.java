package drivers;

import org.apache.ibatis.session.SqlSession;

import java.util.Date;
import java.util.List;

import data.DeliverableMapper;
import domains.Deliverable;

public class DeliverableDAO {

	private static DeliverableMapper deliverableMapper;
	
	public static List<Deliverable> getDeliverables(SqlSession session){
		deliverableMapper = session.getMapper(DeliverableMapper.class);
		List<Deliverable> list = deliverableMapper.getDeliverables();
		return list;
	}
	
	public static Deliverable searchDeliverablesByID(SqlSession session, int ID){
		
		if (ID >= 0 && ID < Integer.MAX_VALUE){
			deliverableMapper = session.getMapper(DeliverableMapper.class);
			return deliverableMapper.searchByID(ID);
		}
		else return null;
	}
	
	public static List<Deliverable> searchDeliverablesByName(SqlSession session, String name){
		
		if (name != null && name.length() <= 50){
			deliverableMapper = session.getMapper(DeliverableMapper.class);
			return deliverableMapper.searchByName(name);
		}
		else return null;
	}
	
	public static List<Deliverable> searchDeliverablesByDueDate(SqlSession session, Date dueDate){
		
		if (dueDate != null){
			deliverableMapper = session.getMapper(DeliverableMapper.class);
			return deliverableMapper.searchByDueDate(dueDate);
		}
		else return null;
	}
	
	public static void createDeliverable(SqlSession session, Deliverable newDeliverable){
		
		if(newDeliverable != null && newDeliverable.getName() != null){
			deliverableMapper = session.getMapper(DeliverableMapper.class);
			deliverableMapper.createDeliverable(newDeliverable);
			session.commit();
		}
	}
	
	public static void deleteByID(SqlSession session, int ID){
		
		if (ID >= 0 && ID < Integer.MAX_VALUE){
			deliverableMapper = session.getMapper(DeliverableMapper.class);
			deliverableMapper.deleteByID(ID);
		}
	}
	
	public static void deleteByName(SqlSession session, String name){
		
		if (name != null && name.length() <= 50){
			deliverableMapper = session.getMapper(DeliverableMapper.class);
			deliverableMapper.deleteByName(name);
		}
	}
	
	public static void deleteAll(SqlSession session){
		deliverableMapper = session.getMapper(DeliverableMapper.class);
		deliverableMapper.deleteAll();
		session.commit();
	}
	
}
