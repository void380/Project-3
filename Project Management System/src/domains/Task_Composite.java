package domains;

import java.util.Date;
import java.util.List;

public class Task_Composite extends Task_Base implements Task_Composite_Interface {
	
	private Date startDate;
	private Date endDate;
	private List<Task_Base> subTasks;  //This can store both Summary Tasks and Milestones, so that they all are associated with a certain major task.
	
	@Override
	public boolean equals(Object o){
		// TODO Auto-generated method stub
		return true;
	}

	public void setStartDate(Date date) {
		// TODO Auto-generated method stub
		
	}

	public Date getStartDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setEndDate(Date date) {
		// TODO Auto-generated method stub
		
	}

	public Date getEndDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setSubTasks(List<Task_Base> subTasks) {
		// TODO Auto-generated method stub
		
	}

	public List<Task_Base> getSubTasks() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addSubTask(Task_Base task) {
		// TODO Auto-generated method stub
		
	}

	public void removeSubTask(Task_Base task) {
		// TODO Auto-generated method stub
		
	}
}
