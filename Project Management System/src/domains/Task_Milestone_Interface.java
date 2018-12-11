package domains;

import java.util.Date;


public interface Task_Milestone_Interface {
	
	public void setCompletionDate(Date date);
	public Date getCompletionDate();
	
	@Override
	public boolean equals(Object o);
	
}
