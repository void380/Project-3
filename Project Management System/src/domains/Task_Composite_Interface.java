package domains;

import java.util.Date;
import java.util.List;

public interface Task_Composite_Interface {
	
	public void setStartDate(Date date);
	public Date getStartDate();
	public void setEndDate(Date date);
	public Date getEndDate();
	
	public void setSubTasks(List<Task_Base> subTasks);
	public List<Task_Base> getSubTasks();
	public void addSubTask(Task_Base task);
	public void removeSubTask(Task_Base task);
	
	
	@Override
	public boolean equals(Object o);
}
