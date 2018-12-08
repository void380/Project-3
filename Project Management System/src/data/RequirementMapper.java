package data;

import java.util.List;
import java.util.Date;

import org.apache.ibatis.annotations.Param;

import domains.Requirement;

public interface RequirementMapper {
	
	public List<Requirement> getRequirements();
	
	public List<Requirement> searchByName(@Param("name") String pName);
	
	public List<Requirement> searchBySourceDoc(@Param("sourceDoc") String pSourceDoc);
	
	public void createRequirement(Requirement requirement);
	
	public void allocateDeliverable(@Param("requirement_ID") int requirment_ID , @Param("deliverable_ID") int deliverable_ID);
	
	public void deallocateDeliverable(@Param("requirement_ID") int requirment_ID , @Param("deliverable_ID") int deliverable_ID);
	
	public void updateDeliverable(Requirement requirement);
	
	public void deleteByID(@Param("ID") int ID);
	
	public void deleteByName(@Param("name") String name);
	
	public void deleteBySourceDoc(@Param("sourceDoc") String pSourceDoc);
	
	public void deleteAll();
}
