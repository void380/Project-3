package domains;

import java.util.Date;
import java.util.List;

import domains.Resource;
import domains.Issue;

public class Task {
	
	private int ID;
	private String name;
	private String description;
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
	private List<Task> predecessorTasks;
	private List<Task> successorTasks;
	private List<Issue> listOfIssues;
	
	public Task(){
		
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
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public List<Task> getPredecessorTasks() {
		return predecessorTasks;
	}
	public void setPredecessorTasks(List<Task> predecessorTasks) {
		this.predecessorTasks = predecessorTasks;
	}
	public List<Task> getSuccessorTasks() {
		return successorTasks;
	}
	public void setSuccessorTasks(List<Task> successorTasks) {
		this.successorTasks = successorTasks;
	}
	public List<Issue> getListOfIssues() {
		return listOfIssues;
	}
	public void setListOfIssues(List<Issue> listOfIssues) {
		this.listOfIssues = listOfIssues;
	}

	
	
	
	
}
