package domains;

import java.util.Date;
import java.util.List;

public class Task_Summary extends Task_Base implements Task_Summary_Interface {
	
	private Resource resource;
	private Date expectedStartDate;
	private Date expectedEndDate;
	private Date actualStartDate;
	private Date actualEndDate;
	private float expectedDuration;
	private float actualDuration;
	private float expectedEffort;
	private float actualEffort;
	private float completedEffort;
	private float percentComplete;
	private List<Task_Summary> predecessorTasks;
	private List<Task_Summary> successorTasks;
	private List<Issue> listOfIssues;
	private List<Decision> listOfDecisions;
	
	public Task_Summary(){
		
		ID = 0;
		name = "";
		description = "";
		resource = new Resource();
		expectedStartDate = new Date();
		expectedEndDate = new Date();
		actualStartDate = new Date();
		actualEndDate = new Date();
		expectedDuration = 0.0f;
		actualDuration = 0.0f;
		expectedEffort = 0.0f;
		actualEffort = 0.0f;
		completedEffort = 0.0f;
		percentComplete = 0.0f;
	}
	
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	public Date getExpectedStartDate() {
		return expectedStartDate;
	}
	public void setExpectedStartDate(Date expectedStartDate) {
		this.expectedStartDate = expectedStartDate;
	}
	public Date getExpectedEndDate() {
		return expectedEndDate;
	}
	public void setExpectedEndDate(Date expectedEndDate) {
		this.expectedEndDate = expectedEndDate;
	}
	public Date getActualStartDate() {
		return actualStartDate;
	}
	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}
	public Date getActualEndDate() {
		return actualEndDate;
	}
	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}
	public float getExpectedDuration() {
		return expectedDuration;
	}
	public void setExpectedDuration(float expectedDuration) {
		this.expectedDuration = expectedDuration;
	}
	public float getActualDuration() {
		return actualDuration;
	}
	public void setActualDuration(float actualDuration) {
		this.actualDuration = actualDuration;
	}
	public float getExpectedEffort() {
		return expectedEffort;
	}
	public void setExpectedEffort(float expectedEffort) {
		this.expectedEffort = expectedEffort;
	}
	public float getActualEffort() {
		return actualEffort;
	}
	public void setActualEffort(float actualEffort) {
		this.actualEffort = actualEffort;
	}
	public float getCompletedEffort() {
		return completedEffort;
	}
	public void setCompletedEffort(float completedEffort) {
		this.completedEffort = completedEffort;
	}
	public float getPercentComplete() {
		return percentComplete;
	}
	public void setPercentComplete(float percentComplete) {
		this.percentComplete = percentComplete;
	}
	public List<Task_Summary> getPredecessorTasks() {
		return predecessorTasks;
	}
	public void setPredecessorTasks(List<Task_Summary> predecessorTasks) {
		this.predecessorTasks = predecessorTasks;
	}
	public List<Task_Summary> getSuccessorTasks() {
		return successorTasks;
	}
	public void setSuccessorTasks(List<Task_Summary> successorTasks) {
		this.successorTasks = successorTasks;
	}
	public List<Issue> getListOfIssues() {
		return listOfIssues;
	}
	public void setListOfIssues(List<Issue> listOfIssues) {
		this.listOfIssues = listOfIssues;
	}

	public List<Decision> getDecisions(){
		return listOfDecisions;
	}
	
	public void addDecision(Decision decision) {
		if (!listOfDecisions.contains(decision))
			listOfDecisions.add(decision);
	}
	
	public void removeDecision(Decision decision) {
		listOfDecisions.remove(decision);
	}

	public void addPredecessorTask(Task_Summary task) {
		// TODO Auto-generated method stub
		
	}

	public void removePredecessorTask(Task_Summary task) {
		// TODO Auto-generated method stub
		
	}

	public void addSuccessorTask(Task_Summary task) {
		// TODO Auto-generated method stub
		
	}

	public void removeSuccessorTask(Task_Summary task) {
		// TODO Auto-generated method stub
		
	}

	public void addIssue(Issue decision) {
		// TODO Auto-generated method stub
		
	}

	public void removeIssue(Issue decision) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean equals(Object o){
		// TODO Auto-generated method stub
		return true;
	}
}

