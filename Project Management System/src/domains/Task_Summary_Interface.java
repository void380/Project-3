package domains;

import java.util.Date;
import java.util.List;

public interface Task_Summary_Interface {
	
	public Resource getResource();
	public void setResource(Resource resource);
	public Date getExpectedStartDate();
	public void setExpectedStartDate(Date expectedStartDate);
	public Date getExpectedEndDate();
	public void setExpectedEndDate(Date expectedEndDate);
	public Date getActualStartDate();
	public void setActualStartDate(Date actualStartDate);
	public Date getActualEndDate();
	public void setActualEndDate(Date actualEndDate);
	public float getExpectedDuration();
	public void setExpectedDuration(float expectedDuration);
	public float getActualDuration();
	public void setActualDuration(float actualDuration);
	public float getExpectedEffort();
	public void setExpectedEffort(float expectedEffort);
	public float getActualEffort();
	public void setActualEffort(float actualEffort);
	public float getCompletedEffort();
	public void setCompletedEffort(float completedEffort);
	public float getPercentComplete();
	public void setPercentComplete(float percentComplete);
	public List<Task_Summary> getPredecessorTasks();
	public void setPredecessorTasks(List<Task_Summary> predecessorTasks);
	public void addPredecessorTask(Task_Summary task);
	public void removePredecessorTask(Task_Summary task);
	public List<Task_Summary> getSuccessorTasks();
	public void setSuccessorTasks(List<Task_Summary> successorTasks);
	public void addSuccessorTask(Task_Summary task);
	public void removeSuccessorTask(Task_Summary task);
	public List<Issue> getListOfIssues();
	public void addIssue(Issue decision);
	public void removeIssue(Issue decision);
	public void setListOfIssues(List<Issue> listOfIssues);
	public List<Decision> getDecisions();
	public void addDecision(Decision decision);
	public void removeDecision(Decision decision);
	
	@Override
	public boolean equals(Object o);
	
}
