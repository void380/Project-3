package data;

import java.util.List;
import java.util.Date;

import org.apache.ibatis.annotations.Param;

import domains.Deliverable;

public interface DeliverableMapper {
	
	public List<Deliverable> getDeliverables();
	
	public Deliverable searchByID(@Param("ID") int ID);
	
	public List<Deliverable> searchByName(@Param("name") String pName);
	
	public List<Deliverable> searchByDueDate(@Param("dueDate") Date pDueDate);
	
	public void createDeliverable(Deliverable deliverable);

	public void updateDeliverable(Deliverable deliverable);
	
	public void deleteByID(@Param("ID") int ID);
	
	public void deleteByName(@Param("name") String name);
	
	public void deleteByDueDate(@Param("dueDate") Date pDueDate);
	
	public void deleteAll();

	
	
}
