package domains;

import java.util.Date;
import java.util.List;

import domains.Resource;
import domains.ReferenceDocument;
import domains.Task_Base;

public class Decision {
	
	private String name;
	private String description;
	private String priority;
	private String impact;
	private String status;
	private String statusDescription;
	private Date dateCreated;
	private Date dateNeeded;
	private Date dateMade;
	private Date expectedCompletionDate;
	private Date actualCompletionDate;
	private Date updateDate;
	private Date noteDate;
	
	private List<Task_Base> affectedTasks;
	private List<String> meetingNotes;
	private List<ReferenceDocument> listOfReferenceDocuments;
	private Resource decisionMaker;
	
	
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
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getImpact() {
		return impact;
	}
	public void setImpact(String impact) {
		this.impact = impact;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateNeeded() {
		return dateNeeded;
	}
	public void setDateNeeded(Date dateNeeded) {
		this.dateNeeded = dateNeeded;
	}
	public Date getDateMade() {
		return dateMade;
	}
	public void setDateMade(Date dateMade) {
		this.dateMade = dateMade;
	}
	public Date getExpectedCompletionDate() {
		return expectedCompletionDate;
	}
	public void setExpectedCompletionDate(Date expectedCompletionDate) {
		this.expectedCompletionDate = expectedCompletionDate;
	}
	public Date getActualCompletionDate() {
		return actualCompletionDate;
	}
	public void setActualCompletionDate(Date actualCompletionDate) {
		this.actualCompletionDate = actualCompletionDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getNoteDate() {
		return noteDate;
	}
	public void setNoteDate(Date noteDate) {
		this.noteDate = noteDate;
	}
	
	public List<Task_Base> getAffectedTasks(){
		return affectedTasks;
	}
	
	public void addAffectedTask(Task_Base task) {
		if (!affectedTasks.contains(task))
			affectedTasks.add(task);
	}
	
	public void removeAffectedTask(Task_Base task) {
		affectedTasks.remove(task);
	}
	
	public List<String> getMeetingNotes() {
		return meetingNotes;
	}
	public void setMeetingNotes(List<String> meetingNotes) {
		this.meetingNotes = meetingNotes;
	}
	public List<ReferenceDocument> getListOfReferenceDocuments() {
		return listOfReferenceDocuments;
	}
	public void setListOfReferenceDocuments(
			List<ReferenceDocument> listOfReferenceDocuments) {
		this.listOfReferenceDocuments = listOfReferenceDocuments;
	}
	public Resource getDecisionMaker() {
		return decisionMaker;
	}
	public void setDecisionMaker(Resource decisionMaker) {
		this.decisionMaker = decisionMaker;
	}
	
	
	@Override
	public boolean equals(Object o){
		// TODO Auto-generated method stub
		return true;
	}
}
