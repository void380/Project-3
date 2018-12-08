package domains;

import java.util.Date;
import java.util.List;

import domains.ActionItem;
import domains.Decision;

public class Issue {
	
	private String name;
	private String description;
	private String priority;
	private String severity;
	private String status;
	private String statusDescription;
	private Date dateRaised;
	private Date dateAssigned;
	private Date expectedCompletionDate;
	private Date updateDate;
	
	private List<ActionItem> listOfActionItems;
	private List<Decision> listOfDecisions;
	
	
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
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
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
	public Date getDateRaised() {
		return dateRaised;
	}
	public void setDateRaised(Date dateRaised) {
		this.dateRaised = dateRaised;
	}
	public Date getDateAssigned() {
		return dateAssigned;
	}
	public void setDateAssigned(Date dateAssigned) {
		this.dateAssigned = dateAssigned;
	}
	public Date getExpectedCompletionDate() {
		return expectedCompletionDate;
	}
	public void setExpectedCompletionDate(Date expectedCompletionDate) {
		this.expectedCompletionDate = expectedCompletionDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public List<ActionItem> getListOfActionItems() {
		return listOfActionItems;
	}
	public void setListOfActionItems(List<ActionItem> listOfActionItems) {
		this.listOfActionItems = listOfActionItems;
	}
	public List<Decision> getListOfDecisions() {
		return listOfDecisions;
	}
	public void setListOfDecisions(List<Decision> listOfDecisions) {
		this.listOfDecisions = listOfDecisions;
	}
	
	
	
	
	
	
}
