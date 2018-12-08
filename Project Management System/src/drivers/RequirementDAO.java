package drivers;

import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import data.DeliverableMapper;
import data.RequirementMapper;
import domains.Requirement;
import drivers.DeliverableDAO;
import domains.Deliverable;

public class RequirementDAO {
	
	private static RequirementMapper requirementMapper;
	
	public static List<Requirement> getRequirements(SqlSession session){
		
		requirementMapper = session.getMapper(RequirementMapper.class);
		List<Requirement> list = requirementMapper.getRequirements();
		return list;
	}
	
	public static void createRequirement(SqlSession session, Requirement requirement){

		if (requirement != null){
			requirementMapper = session.getMapper(RequirementMapper.class);
			requirementMapper.createRequirement(requirement);
			session.commit();
		}
	}
	
	
	public static void allocateDeliverable(SqlSession session, int requirement_ID, int deliverable_ID){
		
		requirementMapper = session.getMapper(RequirementMapper.class);
		
		requirementMapper.allocateDeliverable(requirement_ID, deliverable_ID);
		session.commit();
	}
	
	public static void deallocateDeliverable(SqlSession session, int requirement_ID, int deliverable_ID){
		
		requirementMapper = session.getMapper(RequirementMapper.class);
		
		requirementMapper.deallocateDeliverable(requirement_ID, deliverable_ID);
		session.commit();
	}
	
	public static void deleteByID(SqlSession session, int ID){
		requirementMapper = session.getMapper(RequirementMapper.class);
		requirementMapper.deleteByID(ID);
		session.commit();
	}
	
	public static void deleteByName(SqlSession session, String name){
		requirementMapper = session.getMapper(RequirementMapper.class);
		requirementMapper.deleteByName(name);
		session.commit();
	}
	
	public static void deleteBySourceDoc(SqlSession session, String sourceDoc){
		requirementMapper = session.getMapper(RequirementMapper.class);
		requirementMapper.deleteByName(sourceDoc);
		session.commit();
	}
	
	public static void deleteAll(SqlSession session){
		requirementMapper = session.getMapper(RequirementMapper.class);
		requirementMapper.deleteAll();
		session.commit();
	}
	
}
